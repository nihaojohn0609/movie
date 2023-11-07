package com.example.Movie_Rank.mycgv.service;

import com.example.Movie_Rank.mycgv.entity.User;
import com.example.Movie_Rank.mycgv.user.WebUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    public User findByUserName(String userName);

    void save(WebUser webUser);
}
