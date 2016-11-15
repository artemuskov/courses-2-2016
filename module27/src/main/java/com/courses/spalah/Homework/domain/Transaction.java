package com.courses.spalah.Homework.domain;

import javax.persistence.*;

/**
 * Created by Artem Uskov on 07.11.2016.
 */
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transactionId;

    @ManyToOne
    @JoinColumn(name = "sender_account", nullable = false)
    private Account senderAccount;

    @ManyToOne
    @JoinColumn(name = "reciever_account", nullable = false)
    private Account recieverAccount;

    @Column(name = "sum_transation", nullable = false)
    private Integer sumTransaction = 0;

    public Transaction() {
    }

    public Transaction(Account senderAccount, Account recieverAccount, Integer sumTransaction) {
        this.senderAccount = senderAccount;
        this.recieverAccount = recieverAccount;
        this.sumTransaction = sumTransaction;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Account getSenderAccount() {
        return senderAccount;
    }

    public void setSenderAccount(Account senderAccount) {
        this.senderAccount = senderAccount;
    }

    public Account getRecieverAccount() {
        return recieverAccount;
    }

    public void setRecieverAccount(Account recieverAccount) {
        this.recieverAccount = recieverAccount;
    }

    public Integer getSumTransaction() {
        return sumTransaction;
    }

    public void setSumTransaction(Integer sumTransaction) {
        this.sumTransaction = sumTransaction;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", senderAccount=" + senderAccount +
                ", recieverAccount=" + recieverAccount +
                ", sumTransaction=" + sumTransaction +
                '}';
    }
}
