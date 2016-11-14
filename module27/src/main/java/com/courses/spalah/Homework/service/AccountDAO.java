package com.courses.spalah.Homework.service;

import com.courses.spalah.Homework.domain.Account;

import javax.persistence.EntityManager;

/**
 * Created by Artem Uskov on 07.11.2016.
 */
public class AccountDAO {

    private Account account;
    EntityManager entityManager;

    public AccountDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Account getAccount() {
        return account;
    }

    public void saveAccount(Account account) {
        entityManager.getTransaction().begin();
        entityManager.persist(account);
        entityManager.getTransaction().commit();

        this.account = account;
    }
}
