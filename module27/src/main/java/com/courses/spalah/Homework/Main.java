package com.courses.spalah.Homework;

import com.courses.spalah.Homework.domain.Account;
import com.courses.spalah.Homework.domain.Client;
import com.courses.spalah.Homework.domain.Transaction;
import com.courses.spalah.Homework.service.AccountDAO;
import com.courses.spalah.Homework.service.ClientDAO;
import com.courses.spalah.Homework.service.TransactionDAO;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Artem Uskov on 07.11.2016.
 */
public class Main {

    private static final String PERSISTENCE_UNIT = "com.courses.spalah.module27";
    private static ClientDAO clientDAO;
    private static AccountDAO accountDAO;
    private static TransactionDAO transactionDAO;

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        clientDAO = new ClientDAO(entityManager);
        accountDAO = new AccountDAO(entityManager);
        transactionDAO = new TransactionDAO(entityManager);

//        Client client1 = new Client();
//        client1.setFirstName("Stas");
//        client1.setLastName("Uskov");
//        client1.setInn("1234567890asd");
//
//        clientDAO.saveClient(client1);
        Client client1 = clientDAO.getClient(1);
        Client client2 = clientDAO.getClient(2);

        Account accountClient1 = new Account("5489 3598 1024 5904", client1);
        Account accountClient2 = new Account("1234 5678 9012", client2);

        Collection<Account> client2Accounts = client2.getClientAccounts();
        Collection<Account> client1Accounts = client1.getClientAccounts();
        client2Accounts.add(accountClient2);
        client2.setClientAccounts(client2Accounts);

        client1Accounts.add(accountClient1);
        client1.setClientAccounts(client1Accounts);

        accountDAO.saveAccount(accountClient1);
        accountDAO.saveAccount(accountClient2);


        Account account3 = accountDAO.getAccount(4);
        System.out.println(account3.toString());

        Transaction transaction001 = new Transaction(accountClient2, accountClient1, 100);
        transactionDAO.saveTransaction(transaction001);


    }



}
