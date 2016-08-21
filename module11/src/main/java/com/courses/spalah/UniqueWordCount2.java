package com.courses.spalah;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by Artem Uskov on 19.08.2016.
 */
public class UniqueWordCount2 {

    public static void calculateUniqueWord2(String input, String output) throws IOException {
        FileWriter writer = new FileWriter(output, true);
        String str = String.join("\n", Files.readAllLines(Paths.get(input)));
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(str.split("\\s")));
        HashSet<String> hashList = new HashSet<>();
        HashSet<String> uniqueHashList = new HashSet<>();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("")) {
                list.remove(i);
            }
            if(list.get(i).endsWith(",") | list.get(i).endsWith(".")) {
                list.set(i, list.get(i).substring(0, list.get(i).length() - 1));
            }
            list.set(i, list.get(i).toLowerCase());
        }

        for(String word : list) {
            uniqueHashList.add(word);
        }

        for(String word : list) {
            if(!hashList.add(word)) {
                uniqueHashList.remove(word);
            }
        }

        writer.append("Number of unique words(2) - " + uniqueHashList.size());
        writer.append("\n");
        writer.flush();
        }

    }

