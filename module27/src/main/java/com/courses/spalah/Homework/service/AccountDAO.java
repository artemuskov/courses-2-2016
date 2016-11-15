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

    public Account getAccount(int id) {
        entityManager.getTransaction().begin();
        Account foundAccount = entityManager.find(Account.class, id);
        entityManager.getTransaction().commit();
        return foundAccount;
    }

    public void saveAccount(Account account) {
        entityManager.getTransaction().begin();
        entityManager.persist(account);
        entityManager.getTransaction().commit();
        this.account = account;
        System.out.println("Account saved for client " + account.getClientId().getFirstName() +" "+ account.getClientId().getLastName());
    }
}
