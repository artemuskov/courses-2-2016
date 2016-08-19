package com.courses.spalah;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Artem Uskov on 19.08.2016.
 */
public class MostFrequencyWord {

    public static void searchMostFrequencyWord(String input, String output) throws IOException {
        FileWriter writer = new FileWriter(output, true);
        String frequencyWord = "";
        String str = String.join("\n", Files.readAllLines(Paths.get(input)));
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(str.split("\\s")));
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("")) {
                list.remove(i);
            }
            if(list.get(i).endsWith(",") | list.get(i).endsWith(".")) {
                list.set(i, list.get(i).substring(0, list.get(i).length() - 1));
            }
        }

        int maxWordFrequency = Collections.frequency(list, list.get(0).toLowerCase());;
        for(String word : list) {
            if(maxWordFrequency < Collections.frequency(list, word.toLowerCase())) {
                maxWordFrequency = Collections.frequency(list, word.toLowerCase());
                frequencyWord = word;
                System.out.println(word + " - " + maxWordFrequency);
            }
        }
        writer.append("Most frequency word - " + frequencyWord);
        writer.append("\n");
        writer.flush();
        }

    }

