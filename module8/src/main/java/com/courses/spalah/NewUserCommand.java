package com.courses.spalah;

/**
 * Created by Jeka on 29.07.2016.
 */
public class NewUserCommand extends Command {

    @Override
    public void execute() {
       // table.addUser();
        //table.users[0].setName();
        String userName = arguments[1];
        int balance = Integer.parseInt(arguments[2]);
        User user = new User();
        user.setName(userName);
        user.setBalance(balance);
        ConsoleRoulette.table.addUser(user);
        ConsoleRoulette.table.print();
        System.out.println("added to table");

    }
}
