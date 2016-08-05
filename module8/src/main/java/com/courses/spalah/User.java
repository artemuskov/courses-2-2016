package com.courses.spalah;

import java.util.IntSummaryStatistics;

/**
 * Created by Artem Uskov on 05.08.2016.
 */
public class User {
    String name = "";
    int balance = 0;
    int currentBet = 0;
    boolean isBet = false;

    public void setName(){
        this.name = name;
    }

    public void setBalance() {
        this.balance = balance;
    }

    public void setCurrentBet() {
        this.currentBet = currentBet;
    }

    public void setIsBet() {
        this.isBet = isBet;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getCurrentBet(){
        return currentBet;
    }

    public boolean getIsBet() {
        return isBet;
    }

    public void print() {
        System.out.print("User " + name + "with balance " + balance + ", ");
    }
}
