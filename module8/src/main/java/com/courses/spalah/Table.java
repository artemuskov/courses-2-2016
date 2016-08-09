package com.courses.spalah;

/**
 * Created by Artem Uskov on 05.08.2016.
 */
public class Table {
    User[] users = new User[5];
    int userCount = 0;


    public void tableFill() {
        for (int i = 0; i < users.length; i++) {
            users[i] = new User();
        }
    }

    public void addUser () {
        users[userCount].setName();
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount() {
        this.userCount = userCount;
    }

    public void print() {
        for (int i = 0; i < 5; i++) {
            users[i].print();
        }
    }
}

