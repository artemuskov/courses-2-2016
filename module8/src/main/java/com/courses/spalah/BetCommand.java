package com.courses.spalah;

/**
 * Created by Jeka on 29.07.2016.
 */
public class BetCommand extends Command {

    @Override
    public void execute() {
        Table table = getTable();
        String userName = arguments[1];
        int bet = Integer.parseInt(arguments[2]);
        String betType = arguments[3];
        //System.out.println("СТАВКА");
        //System.out.println(userName);
        //System.out.println(bet);
        ConsoleRoulette.table.setBet(userName, bet, betType);
    }
}
