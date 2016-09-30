package com.courses.spalah;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.ServletException;
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

        Person person = new Person(null, null, null);
        DataManager data = new DataManager();
        int param1 = Integer.parseInt(request.getParameter("userId"));
        try {
            ConnectionManager connectionManager = new ConnectionManager("C:\\db.properties");
            Connection connection = connectionManager.createConnection();
            person = data.readPerson(param1, connection);
            connection.close();
            String name = person.getName();
            String surname = person.getSurname();
            String address = person.getAddress();

            final String GETNAMERESPONSE = "<html><body>" + name + " " + surname + " " + address + "</body></html>";
            response.getWriter().write(GETNAMERESPONSE);
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().write("<html><body>Wrong request</body></html>");
        }


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Person person = new Person(null, null, null);
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String address = request.getParameter("address");
        person.setName(name);
        person.setSurname(surname);
        person.setAddress(address);
        int userId;
        DataManager data = new DataManager();
        ConnectionManager connectionManager = new ConnectionManager("C:\\db.properties");
        try {
            Connection connection = connectionManager.createConnection();
            userId = data.savePerson(person, connection);
            connection.close();
            final String SETUSERRESPONSE = "<html><body>User " + name + " " + surname + " " + address + " saved with id " + userId + "</body></html>";
            response.getWriter().write(SETUSERRESPONSE);
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().write("<html><body>Wrong request</body></html>");
        }
    }
}
