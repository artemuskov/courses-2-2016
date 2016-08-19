package com.courses.spalah;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Artem Uskov on 19.08.2016.
 */
public class SentenseCount {

    public static void calculateSentense(String input, String output)throws IOException{
        FileReader reader = new FileReader(input);
        FileWriter writer = new FileWriter(output, true);
        Scanner sc = new Scanner(reader);
        int sentensesCount = 0;
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            for(int i = 0; i < line.length(); i++) {
                if(line.charAt(i) == '.') {
                    sentensesCount++;
                }
            }
        }
        writer.append("Sentences quantity - " + Integer.toString(sentensesCount));
        writer.append("\n");
        writer.flush();
    }
}
