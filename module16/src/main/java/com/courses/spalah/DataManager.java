package com.courses.spalah;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Artem Uskov on 26.09.2016.
 */
public class DataManager {
    private final String INSERTTOADDRESS = "INSERT INTO address VALUE(id, ?)";
    private final String INSERTTOPERSON = "INSERT INTO person VALUE(id, ?, ?, ?)";
    private final String SELECTPERSON = "SELECT person.first_name, person.last_name, address.address FROM person\n" +
            "INNER JOIN address ON address_id = address.id WHERE person.id = ?";
    private final String FIRSTNAME = "first_name";
    private final String SURNAME = "last_name";
    private final String ADDRESS = "address";


    public void savePerson(Person person) throws IOException, SQLException {
        String name = person.getName();
        String surname = person.getSurname();
        String address = person.getAddress();
        Connection connection = Contacts.connectionManager.createConnection();
        PreparedStatement psPerson = connection.prepareStatement(INSERTTOPERSON);
        PreparedStatement psAddress = connection.prepareStatement(INSERTTOADDRESS);

    }

    public Person readPerson(int id) throws IOException, SQLException {
        Person person = new Person(null, null, null);
        Connection connection = Contacts.connectionManager.createConnection();
        PreparedStatement psSelectperson = connection.prepareStatement(SELECTPERSON);
        psSelectperson.setInt(1, id);
        ResultSet result = psSelectperson.executeQuery();
        while (result.next()) {
            person.setName(result.getString(FIRSTNAME));
            person.setSurname(result.getString(SURNAME));
            person.setAddress(result.getString(ADDRESS));
        }
        psSelectperson.close();
        connection.close();
        return person;
    }
}
