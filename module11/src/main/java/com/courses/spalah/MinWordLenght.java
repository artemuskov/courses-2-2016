package com.courses.spalah;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Artem Uskov on 19.08.2016.
 */
public class MinWordLenght {

    public static void calculateMinWordlenght(String input, String output) throws IOException {
        FileWriter writer = new FileWriter(output, true);
        int wordLenght = 0;
        ArrayList<String> list = CreateArrayList.createArrayList(input);

        wordLenght = list.get(0).length();
        for(String word : list) {
            if(word.length() < wordLenght) {
                wordLenght = word.length();
            }
        }

        writer.append("Min lenght of word - " + Integer.toString(wordLenght));
        writer.append("\n");
        writer.flush();
    }
}
