package com.courses.spalah.Homework.service;

import com.courses.spalah.Homework.domain.Transaction;

/**
 * Created by Artem Uskov on 07.11.2016.
 */
public class TransactionDAO {

    private Transaction transaction;

    public TransactionDAO(Transaction transaction) {
        this.transaction = transaction;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
