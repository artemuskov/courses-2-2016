package com.courses.spalah.Homework.service;

import com.courses.spalah.Homework.domain.Account;

/**
 * Created by Artem Uskov on 07.11.2016.
 */
public class AccountDAO {

    private Account account;

    public AccountDAO(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
