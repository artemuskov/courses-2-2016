package com.courses.spalah.Homework.service;

import com.courses.spalah.Homework.domain.Client;

import javax.persistence.EntityManager;

/**
 * Created by Artem Uskov on 12.11.2016.
 */
public class ClientDAO {

    private Client client;
    EntityManager entityManager;

    public ClientDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Client getClient(int id) {
        entityManager.getTransaction().begin();
        Client foundClient = entityManager.find(Client.class, id);
        entityManager.getTransaction().commit();
        return foundClient;
    }

    public void saveClient(Client client) {
        entityManager.getTransaction().begin();
        entityManager.persist(client);
        entityManager.getTransaction().commit();
        this.client = client;
    }
}
