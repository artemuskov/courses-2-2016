package com.courses.spalah;

/**
 * Created by artem on 18.07.2016.
 */
public class Depozit {
    float vklad;
    float stavka;
    String name;

    public Depozit(){}

    public Depozit(float vkladfromconstructor, float stavkafromconstructor, String namefromconstructor) {
        vklad = vkladfromconstructor;
        stavka = stavkafromconstructor;
        name = namefromconstructor;
    }

    public float pributok (int years){
        float pributok = 0;
         for (int i = 1; i == years; i++){
             pributok = pributok + vklad * stavka / 100
             vklad = vklad + vklad * stavka / 100;
        }
        return pributok;
    }
}
