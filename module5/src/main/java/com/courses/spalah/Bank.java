package com.courses.spalah;

/**
<<<<<<< HEAD
 * Created by admin on 19.07.2016.
 */
public class Bank {
    String nameOfBank;
    Deposit deposit1;
    Deposit deposit2;
    Deposit deposit3;

    public void main(String[] args){
        System.out.print(paymentOfDeposit(3));
    }

    public Bank (String nameOfBankFromConstructor){
        nameOfBank = nameOfBankFromConstructor;
        deposit1 = new Deposit(100, 15, "Ann");
        deposit2 = new Deposit(200, 13, "Poul");
        deposit3 = new Deposit(300, 11, "Sam");
    }

    public float paymentOfDeposit(int n){
        float payment = deposit1.getProfit(n) + deposit2.getProfit(n) + deposit3.getProfit(n);
        return payment;
=======
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



>>>>>>> 44f3ea71254363f4dd57cdcece8ae816ee3acbd0
    }
}
