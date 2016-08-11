package com.courses.spalah;

import java.util.IntSummaryStatistics;

/**
 * Created by Artem Uskov on 05.08.2016.
 */
public class User {
    private String name = "";
    private int balance = 0;
    private int currentBet = 0;
    private boolean isBet = false;
    private String betType = "";

    public void setName(String name){
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCurrentBet(int currentBet) {
        this.currentBet = currentBet;
    }

    public void setIsBet(boolean isBet) {
        this.isBet = isBet;
    }

    public void setBetType(String betType){
        this.betType = betType;
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

    public String getBetType() {
        return betType;
    }

    public void print() {
        System.out.println(name + " with balance " + balance + ", current bet = " + currentBet + ", isBet = " + isBet + ", " + "betType = " + betType + ";");
    }
}
