package com.courses.spalah.Homework.bank;

/**
 * Created by Artem Uskov on 24.07.2016.
 */
class Credit {
    private float currentCredit;
    private float persentPerYear;
    private int yearsOfCredit;

<<<<<<< HEAD:module5/src/main/java/com/courses/spalah/Homework/Credit.java
    public Credit(float currentCredit, float persentPerYear, int yearsOfCredit) {
=======
    public Credit(float currentCredit, float persentPerYear, int yearsOfCredit){
>>>>>>> 068c314f81e2f3510f5d9a981206670dfbbf2895:module6/src/main/java/com/courses/spalah/Homework/bank/Credit.java
        this.currentCredit = currentCredit;
        this.persentPerYear = persentPerYear;
        this.yearsOfCredit = yearsOfCredit;
    }

<<<<<<< HEAD:module5/src/main/java/com/courses/spalah/Homework/Credit.java
    float getCreditAmount(float persentPerYear, int yearsOfCredit){
=======
    float getCreditAmount(float persentPerYear, float currentCredit, int yearsOfCredit){
>>>>>>> 068c314f81e2f3510f5d9a981206670dfbbf2895:module6/src/main/java/com/courses/spalah/Homework/bank/Credit.java
          return currentCredit + (currentCredit * persentPerYear / 100 * yearsOfCredit);
    }

    float getCurrentCredit(){
        return currentCredit;
    }

    float getPersentPerYear(){
        return persentPerYear;
    }

    int getYearsOfCredit(){
        return yearsOfCredit;
    }
}
