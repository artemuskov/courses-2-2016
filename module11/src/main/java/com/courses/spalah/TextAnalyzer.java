package com.courses.spalah;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Ievgen Tararaka
 */
public class TextAnalyzer {
    private static String INPUT_FILE = "C:\\spalah\\courses-2-2016\\module11\\src\\main\\resources\\text_sample.txt";
    private static String OUTPUT_FILE = "C:\\spalah\\courses-2-2016\\module11\\src\\main\\resources\\statistics.txt";



    public static void main(String[] args) throws IOException {

            FileReader fr = new FileReader("C:\\spalah\\courses-2-2016\\module11\\src\\main\\resources\\text_sample.txt");
            Scanner sc = new Scanner(fr);
            WordsCount.calculate();





    }

    public static String getInputFile() {
        return INPUT_FILE;
    }
}
