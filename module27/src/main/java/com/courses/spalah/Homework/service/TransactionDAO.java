package com.courses.spalah.Homework.service;

import com.courses.spalah.Homework.domain.Transaction;

import javax.persistence.EntityManager;

/**
 * Created by Artem Uskov on 07.11.2016.
 */
public class TransactionDAO {

    private Transaction transaction;
    private EntityManager entityManager;

    public TransactionDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void saveTransaction(Transaction transaction) {
        entityManager.getTransaction().begin();
        entityManager.persist(transaction);
        entityManager.getTransaction().commit();
        System.out.println("Success!");
        this.transaction = transaction;
    }
}
