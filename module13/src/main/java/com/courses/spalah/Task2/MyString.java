package com.courses.spalah.Task2;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Artem Uskov on 01.09.2016.
 */
public class MyString {

    private char[] chars;

    public MyString(char[] chars){
        this.chars = chars;
    }

    public void print() {
        for(int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }

    public void reverse() {
        char[] tempchars = new char[chars.length];
        int j = 0;
        for(int i = chars.length - 1; i >= 0; i-- ) {
            tempchars[j] = chars[i];
            j++;
        }
        chars = tempchars;
    }

    public int length() {
        return chars.length;
    }

    public char getByIndex(int index) {
        try {
            return chars[index];
        } catch (Exception ex) {
            return ' ';
        }
    }
}
