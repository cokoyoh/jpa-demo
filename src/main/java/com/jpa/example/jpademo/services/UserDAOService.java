package com.jpa.example.jpademo.services;

import com.jpa.example.jpademo.entities.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDAOService {
    @PersistenceContext
    private EntityManager entityManager;

    public long save(User user) {
        entityManager.persist(user);

        return  user.getId();
    }
}
