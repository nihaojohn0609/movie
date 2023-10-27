package com.example.Movie_Rank.mycgv.repository;

import com.example.Movie_Rank.mycgv.entity.User;

public interface UserRepository {

    User findByUserName(String userName);
}
