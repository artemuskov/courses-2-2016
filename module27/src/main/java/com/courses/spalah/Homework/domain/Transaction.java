package com.courses.spalah.Homework.domain;

/**
 * Created by Artem Uskov on 07.11.2016.
 */
public class Transaction {

    private Integer transactionId;
    private Account senderAccount;
    private Account recieverAccount;
    private Integer sumTransaction;

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
