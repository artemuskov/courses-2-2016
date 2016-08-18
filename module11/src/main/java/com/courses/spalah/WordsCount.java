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
    //private static String input = TextAnalyzer.getInputFile();



    public static void calculate() throws IOException {
        FileReader reader = new FileReader("C:\\spalah\\courses-2-2016\\module11\\src\\main\\resources\\text_sample.txt");
        FileWriter writer = new FileWriter("C:\\spalah\\courses-2-2016\\module11\\src\\main\\resources\\statistics.txt", true);
        Scanner sc = new Scanner(reader);
        int wordCount = 0;
        while(sc.hasNext()) {
            sc.next();
            wordCount++;
        }
        String out = Integer.toString(wordCount);

        System.out.println(wordCount);
        writer.append("\n");
        writer.write(out);
        writer.flush();
        writer.close();

    };
}
