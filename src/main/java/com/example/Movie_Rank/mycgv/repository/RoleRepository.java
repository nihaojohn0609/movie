package com.example.Movie_Rank.mycgv.repository;

import com.example.Movie_Rank.mycgv.entity.Role;

public interface RoleRepository {

    public Role findRoleByName(String theRoleName);
}
