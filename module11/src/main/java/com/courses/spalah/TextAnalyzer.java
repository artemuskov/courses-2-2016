package com.courses.spalah;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Ievgen Tararaka
 */
public class TextAnalyzer {
    private static String INPUT_FILE = "C:\\spalah\\courses-2-2016\\module11\\src\\main\\resources\\text_sample.txt";
    private static String OUTPUT_FILE = "C:\\spalah\\courses-2-2016\\module11\\src\\main\\resources\\statistics.txt";



    public static void main(String[] args) throws IOException {

        //FileReader fr = new FileReader("C:\\spalah\\courses-2-2016\\module11\\src\\main\\resources\\text_sample.txt");
        FileWriter writer = new FileWriter(OUTPUT_FILE, false);
        writer.flush();
        WordsCount.calculateWords(INPUT_FILE, OUTPUT_FILE);
        TokensCount.calculateTokens(INPUT_FILE, OUTPUT_FILE);
        SentenseCount.calculateSentense(INPUT_FILE, OUTPUT_FILE);
        MaxWordLenght.calculateMaxWordlenght(INPUT_FILE, OUTPUT_FILE);
        MinWordLenght.calculateMinWordlenght(INPUT_FILE, OUTPUT_FILE);
        UniqueWordCount.calculateUniqueWord(INPUT_FILE, OUTPUT_FILE);





    }

    public static String getInputFile() {
        return INPUT_FILE;
    }
}
