package com.courses.spalah.Homework.domain;

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

    @Column(name = "client_id", nullable = false)
    private Client clientId;

    @Column(name = "balance", nullable = false)
    private Integer balance;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "account", orphanRemoval = true)
    private Collection<Transaction> transactions = new ArrayList<>();

    public Account() {
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
