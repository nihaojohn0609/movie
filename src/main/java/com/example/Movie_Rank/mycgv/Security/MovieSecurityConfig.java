package com.example.Movie_Rank.mycgv.Security;

import jakarta.servlet.DispatcherType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class MovieSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeRequests(configurer ->
                        configurer
                                .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
                                .requestMatchers(new AntPathRequestMatcher("/")).hasRole("EMPLOYEE")
                                .requestMatchers(new AntPathRequestMatcher("/leaders/**")).hasRole("MANAGER")
                                .requestMatchers(new AntPathRequestMatcher("/admin/**")).hasRole("ADMIN")
                                .anyRequest().authenticated())
                .formLogin(form ->
                        form
                                .loginPage("/login")
                                .loginProcessingUrl("/authenticateTheUser")
                                .permitAll())
                .logout(logout -> logout.permitAll()).exceptionHandling(configurer -> configurer.accessDeniedPage("/access-denied"));
        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {

        UserDetails lim = User.builder()
                .username("lim")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails sun = User.builder()
                .username("sun")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails kim = User.builder()
                .username("kim")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER")
                .build();

        UserDetails min = User.builder()
                .username("min")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(lim, sun, kim, min);
    }
}
