package com.courses.spalah.Homework;

import com.courses.spalah.Homework.domain.Account;
import com.courses.spalah.Homework.domain.Client;
import com.courses.spalah.Homework.service.AccountDAO;
import com.courses.spalah.Homework.service.ClientDAO;
import com.courses.spalah.Homework.service.TransactionDAO;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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

//        Client client1 = new Client();
//        client1.setFirstName("Stas");
//        client1.setLastName("Uskov");
//        client1.setInn("1234567890asd");
//
//        clientDAO.saveClient(client1);

        Client client2 = clientDAO.getClient(2);
        System.out.println(client2.toString());

        Account accountClient2 = new Account("1234 5678 9012", client2);
        System.out.println(accountClient2.toString());

        accountDAO.saveAccount(accountClient2);


    }



}
