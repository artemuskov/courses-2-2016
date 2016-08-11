package com.courses.spalah;

/**
 * Created by Artem Uskov on 05.08.2016.
 */
public class Table {
    private final static int MAXUSERS = 5;
    private User[] users = new User[MAXUSERS];
    private int userCount = 0;
    private int casinoBalance = 0;

    public void addUser (User user) {
        // if (userCount == MAXUSERS) {
        //    return;
        //   }
        users[userCount] = user;
        userCount++;
    }

    public void setCasinoBalance(int casinoBalance) {
        this.casinoBalance = casinoBalance;
    }

    public int getCasinoBalance() {
        return casinoBalance;
    }

    public void setBet(String userName, int currentBet, String betType){
        for (int i = 0; i < userCount; i++) {
            String name = users[i].getName();
            if (name.equalsIgnoreCase(userName)) {
                users[i].setCurrentBet(currentBet);
                users[i].setIsBet(true);
                users[i].setBalance(users[i].getBalance() - currentBet);
                users[i].setBetType(betType);
            }
        }
    }



    public int getUserCount() {
        return userCount;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }


    public void print() {
        for (int i = 0; i < userCount; i++) {
            users[i].print();
        }
    }
}

