package com.courses.spalah.Temp;

import com.sun.scenario.effect.impl.state.LinearConvolveRenderState;

import java.util.*;

/**
 * Created by artem on 21.08.2016.
 */
public class Collections {

    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", 5);
        Cat murzik = new Cat("Мурзик", 3);
        Cat cezar = new Cat("Цезарь", 7);
        Dog polkan = new Dog("Полкан", 12);
        Dog dixi = new Dog("Дикси", 6);

        ArrayList<Cat> arrayCats = new ArrayList<>();
        ArrayList<Dog> arrayDogs = new ArrayList<>();
        LinkedList<Cat> linkedCats = new LinkedList<>();
        HashSet<Cat> hashCats = new HashSet<>();


        arrayCats.add(barsik);
        arrayCats.add(barsik);
        arrayCats.add(barsik);
        arrayCats.add(murzik);
        arrayCats.add(cezar);
        arrayDogs.add(polkan);
        arrayDogs.add(dixi);

//        System.out.println("Размер котов - " + arrayCats.size());
//        for(Cat cat : arrayCats) {
//            System.out.println(cat.toString());
//        }


        linkedCats.add(barsik);
        linkedCats.add(1, murzik);
        linkedCats.set(1, new Cat("Васька", 8));
        linkedCats.addFirst(cezar);
        Cat newCat = linkedCats.pollLast();
        //System.out.println(newCat.toString());
        linkedCats.push(murzik);

        hashCats.add(barsik);
        System.out.println(hashCats.add(murzik));

        Iterator<Cat> itr = hashCats.iterator();
        while(itr.hasNext()) {
            Cat hashCat = itr.next();
            System.out.println(hashCat);
        }



        System.out.println("Размер котов - " + hashCats.size());
        for(Cat cat : hashCats) {
            System.out.println(cat.toString());
        }


    }
}
