package com.courses.spalah;

/**
 * Created by Jeka on 29.07.2016.
 */
public class NewUserCommand extends Command {

    @Override
    public void execute() {
        String userName = arguments[1];
        int balance = Integer.parseInt(arguments[2]);
        User user = new User();
        user.setName(userName);
        user.setBalance(balance);
        try {
            ConsoleRoulette.table.addUser(user);
            user.print();
            System.out.println("added to table");
        } catch (Exception ex) {
            if (ConsoleRoulette.table.getUserCount() == 5) {
                System.out.println("Maximum quantity of users reached");
            }

        }

    }
}
