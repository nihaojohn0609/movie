package com.example.Movie_Rank.mycgv.repository;

import com.example.Movie_Rank.mycgv.entity.Role;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

@Repository
public class RoleRepositoryImpl implements RoleRepository {

    private EntityManager entityManager;

    public RoleRepositoryImpl(EntityManager theEntityManager) {
        this.entityManager = theEntityManager;
    }
    @Override
    public Role findRoleByName(String theRoleName) {

        // retrieve/read from database using name
        TypedQuery<Role> theQuery = entityManager.createQuery("from Role where name=:roleName", Role.class);
        theQuery.setParameter("roleName", theRoleName);

        Role theRole = null;

        try {
            theRole = theQuery.getSingleResult();
        } catch (Exception e) {
            theRole = null;
        }

        return theRole;
    }
}
