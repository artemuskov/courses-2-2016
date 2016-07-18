package com.courses.spalah;

/**
 * Created by artem on 18.07.2016.
 */
public class Bank {
    String nameofbank;
    Depozit Depozit1;
    Depozit Depozit2;
    Depozit Depozit3;

    public Bank (String nameofbankofconstructor) {
        nameofbank = nameofbankofconstructor;
        Depozit Depozit1 = new Depozit(100, 15, "Ann");
        Depozit Depozit2 = new Depozit(200, 13, "Tom");
        Depozit Depozit3 = new Depozit(300, 10, "Can");
    }


    public static void main(String asrs[]){
         int years = 3;
         float viplata;



    }
}
