package com.courses.spalah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;

/**
 * Класс-стартер для вашей реализации рулетки
 */
public class ConsoleRoulette {
    public static void main(String[] args) {
        Roulette roulette = new Roulette();
        Table table = new Table();
        table.tableFill();
        System.out.println("Game Started");
        roulette.generate();
        roulette.print();
        System.out.println();
        table.print();
        System.out.println();


        while(true) {
            String[] arguments = readFromConsole();
            try {
                CommandParser commandParser = new CommandParser();
                Command command = commandParser.getCommand(arguments);
                command.setRoulette(roulette);
                command.execute();
            } catch (Exception exception) {
                System.out.println("start, new_user, bet, exit");
            }
        }
    }

    public static String[] readFromConsole() {
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String input = bufferRead.readLine();
            return input.split("\\s");
        } catch (IOException e) {
            return new String[]{""};
        }
    }
}
