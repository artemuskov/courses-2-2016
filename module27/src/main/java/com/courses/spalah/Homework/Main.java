package com.courses.spalah.Homework;

import com.courses.spalah.Homework.domain.Client;
import com.courses.spalah.Homework.service.ClientDAO;
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

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Client client1 = new Client();
        client1.setFirstName("Stas");
        client1.setLastName("Uskov");
        client1.setInn("1234567890asd");

        clientDAO = new ClientDAO(entityManager);
        clientDAO.saveClient(client1);


    }



}
