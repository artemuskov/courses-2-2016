package com.courses.spalah.Homework;

import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Artem Uskov on 07.11.2016.
 */
public class Main {

    private static final String PERSISTENCE_UNIT = "com.courses.spalah.module27";

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.close();
    }
}
