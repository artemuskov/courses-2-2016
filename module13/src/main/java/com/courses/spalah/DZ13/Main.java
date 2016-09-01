package com.courses.spalah;

/**
 * Created by Artem Uskov on 01.09.2016.
 */
public class Main {

    public static void main(String[] args) {
        char[] inputchars = {'d', 'w', 'r', 'u', 'g'};
        MyString string1 = new MyString(inputchars);
        //string1.reverse();
        string1.print();
        System.out.println();
        System.out.print(string1.length());
        System.out.println();
        System.out.print(string1.getByIndex(1));
    }
}
