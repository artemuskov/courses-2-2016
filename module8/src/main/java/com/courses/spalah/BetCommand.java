package com.courses.spalah;

/**
 * Created by Jeka on 29.07.2016.
 */
public class BetCommand extends Command {

    @Override
    public void execute() {
        Table table = getTable();
        try {
            String userName = arguments[1];
            int bet = Integer.parseInt(arguments[2]);
            String betType = arguments[3];
            //System.out.println("СТАВКА");
            //System.out.println(userName);
            //System.out.println(bet);
            if (arguments.length == 4) {
                ConsoleRoulette.table.setBet(userName, bet, betType);
            }
            if (arguments.length == 5) {
                int betNumber = Integer.parseInt(arguments[4]);
                ConsoleRoulette.table.setBet(userName, bet, betType, betNumber);
            }
        } catch (Exception ex) {
            System.out.println("bet command must be:");
            System.out.println("bet [user] [betsum] [bettype] [betnumber]");
        }
    }
}
