package com.courses.spalah.Homework.service;

import com.courses.spalah.Homework.domain.Account;
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
        Account senderAccount = transaction.getSenderAccount();
        Account recieverAccount = transaction.getRecieverAccount();
        entityManager.getTransaction().begin();
        entityManager.persist(transaction);
        senderAccount.setBalance(senderAccount.getBalance() - transaction.getSumTransaction());
        recieverAccount.setBalance(recieverAccount.getBalance() + transaction.getSumTransaction());
        entityManager.getTransaction().commit();
        System.out.println("Success!");
        this.transaction = transaction;
    }
}
