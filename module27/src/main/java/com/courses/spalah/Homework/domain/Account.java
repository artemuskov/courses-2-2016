package com.courses.spalah.Homework.domain;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Artem Uskov on 07.11.2016.
 */

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "account_number", nullable = false)
    private String accountNumber;

    @ManyToOne()
    @JoinColumn(name = "client_id", nullable = false)
    private Client clientId;

    @Column(name = "balance", nullable = false)
    private Integer balance = 0;


    public Account() {
    }

    public Account(String accountNumber, Client clientId) {
        this.accountNumber = accountNumber;
        this.clientId = clientId;
    }

    public Account(Client clientId) {
        this.clientId = clientId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", clientId=" + clientId +
                ", balance=" + balance +
                '}';
    }
}
