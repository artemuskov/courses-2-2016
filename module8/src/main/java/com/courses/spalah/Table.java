package com.courses.spalah;

import java.nio.file.FileSystemNotFoundException;

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
        if(currentBet < 1 || currentBet > 500) {
            System.out.println("Bet must be bigger 1 and lower 500");
        }
        else {
            for (int i = 0; i < userCount; i++) {
                String name = users[i].getName();
                if (name.equalsIgnoreCase(userName)) {
                    if((users[i].getBalance() < currentBet) || (users[i].getIsBet())) {
                        System.out.println("Bet not accepted");
                    }
                    else{
                        users[i].setCurrentBet(currentBet);
                        users[i].setIsBet(true);
                        users[i].setBalance(users[i].getBalance() - currentBet);
                        users[i].setBetType(betType);
                        System.out.println("Bet accepted");
                    }
                }
            }
        }
    }

    public void setBet(String userName, int currentBet, String betType, int betNumber){
        if(currentBet < 1 || currentBet > 500) {
            System.out.println("Bet must be bigger 1 and lower 500");
        }
        else {
            for (int i = 0; i < userCount; i++) {
                String name = users[i].getName();
                if (name.equalsIgnoreCase(userName)) {
                    if((users[i].getBalance() < currentBet) || (users[i].getIsBet()) || (betNumber < 0) || (betNumber > 36)) {
                        System.out.println("Bet not accepted");
                    }
                    else{
                        users[i].setCurrentBet(currentBet);
                        users[i].setIsBet(true);
                        users[i].setBalance(users[i].getBalance() - currentBet);
                        users[i].setBetType(betType);
                        System.out.println("Bet accepted");
                    }
                }
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

