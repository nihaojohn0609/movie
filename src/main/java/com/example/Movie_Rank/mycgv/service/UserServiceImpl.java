package com.example.Movie_Rank.mycgv.service;

import com.example.Movie_Rank.mycgv.entity.Role;
import com.example.Movie_Rank.mycgv.entity.User;
import com.example.Movie_Rank.mycgv.repository.RoleRepository;
import com.example.Movie_Rank.mycgv.repository.UserRepository;
import com.example.Movie_Rank.mycgv.user.WebUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    private RoleRepository roleRepository;

    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }
    @Override
    public User findByUserName(String userName) {
        // check the database if the user already exists
        return userRepository.findByUserName(userName);
    }

    @Override
    public void save(WebUser webUser) {
        User user = new User();

        user.setUserName(webUser.getUserName());
        user.setPassword(passwordEncoder.encode(webUser.getPassword()));
        user.setFirstName(webUser.getFirstName());
        user.setLastName(webUser.getLastName());
        user.setEmail(webUser.getEmail());

        // give user default role of "employees"
        user.setRoles(Arrays.asList(roleRepository.findRoleByName("ROLE_EMPLOYEE")));

        userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
        if(user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }

        Collection<SimpleGrantedAuthority> authorities = mapRolesToAuthorities(user.getRoles());

        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
                authorities);
    }

    private Collection<SimpleGrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();

        for(Role tempRole: roles) {
            SimpleGrantedAuthority tempAuthority = new SimpleGrantedAuthority(tempRole.getName());
            authorities.add(tempAuthority);
        }
        return authorities;
    }
}
