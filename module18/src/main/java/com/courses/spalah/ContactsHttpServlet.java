package com.courses.spalah;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 * Created by Artem Uskov on 29.09.2016.
 */
public class ContactsHttpServlet extends HttpServlet {


    private static void registerDriver() throws ClassNotFoundException, SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName("com.mysql.jdbc.Driver");
    }



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            registerDriver();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        Person person;
        DataManager data = new DataManager();
        try {
            ConnectionManager connectionManager = new ConnectionManager("C:\\db.properties");
            Connection connection = connectionManager.createConnection();
            person = data.readPerson(1, connection);
            connection.close();
            String name = person.getName();
            String surname = person.getSurname();
            String address = person.getAddress();
            final String GETNAMERESPONSE = "<html><body>" + name + " " + surname + " " + address + "</body></html>";
            response.getWriter().write(GETNAMERESPONSE);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.getWriter().write("<html><body>Response from Contacts servlet !!!</body></html>");
    }
}
