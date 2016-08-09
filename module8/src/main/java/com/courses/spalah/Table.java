package com.courses.spalah;

/**
 * Created by Artem Uskov on 05.08.2016.
 */
public class Table {
    final static int maxUsers = 5;
    private User[] users = new User[maxUsers];
    private int userCount = 0;


    public void tableFill() {
        for (int i = 0; i < users.length; i++) {
            users[i] = new User();
        }
    }

    public void addUser (User user) {
       if (userCount == maxUsers) {
           return;
       }
       users[userCount] = user;
        userCount++;
    }

    public int getUserCount() {
        return userCount;
    }

    public void print() {
        for (int i = 0; i < maxUsers; i++) {
            users[i].print();
        }
    }
}

