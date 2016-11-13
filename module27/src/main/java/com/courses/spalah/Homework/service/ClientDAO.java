package com.courses.spalah.Homework.service;

import com.courses.spalah.Homework.domain.Client;

/**
 * Created by Artem Uskov on 12.11.2016.
 */
public class ClientDAO {

    private Client client;

    public ClientDAO(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
