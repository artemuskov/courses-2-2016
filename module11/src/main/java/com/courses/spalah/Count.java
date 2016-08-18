package com.courses.spalah;

/**
 * Created by Artem Uskov on 18.08.2016.
 */
public abstract class Count {
    private static String input = TextAnalyzer.getInputFile();

    public abstract void calculate();

    public String getInput() {
        return input;
    }

}
