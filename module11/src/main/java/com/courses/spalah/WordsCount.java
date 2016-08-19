package com.courses.spalah;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Artem Uskov on 18.08.2016.
 */
public class WordsCount {

    public static void calculateWords(String input, String output) throws IOException {
        FileReader reader = new FileReader(input);
        FileWriter writer = new FileWriter(output, true);
        Scanner sc = new Scanner(reader);
        int wordCount = 0;
        while(sc.hasNext()) {
            sc.next();
            wordCount++;
        }
        writer.write("Words quantity - " + Integer.toString(wordCount));
        writer.append("\n");
        writer.flush();
    };
}
