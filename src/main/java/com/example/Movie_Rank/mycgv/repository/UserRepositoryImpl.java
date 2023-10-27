package com.example.Movie_Rank.mycgv.repository;

import com.example.Movie_Rank.mycgv.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private EntityManager entityManager;

    public UserRepositoryImpl(EntityManager theEntityManager) {
        this.entityManager = theEntityManager;
    }
    @Override
    public User findByUserName(String theUserName) {

        // retrieve/read from database using username
        TypedQuery<User> theQuery = entityManager.createQuery("from User where userName=:uName", User.class);
        theQuery.setParameter("uName", theUserName);

        User theUser = null;
        try {
            theUser = theQuery.getSingleResult();
        } catch (Exception e) {
            theUser = null;
        }

        return theUser;
    }
}
