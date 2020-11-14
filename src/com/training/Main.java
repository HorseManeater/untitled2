package com.training;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bear bear = new Bear(10, "red");

        Animal animal = bear;

        if (animal instanceof Bear) {
            Bear baloo = (Bear) animal;
            try {
                baloo.roar(-1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        List<CanPurr> list = new ArrayList<>();

//        list.add(new Tiger());
        Tiger tiger = new Tiger();
        list.add(tiger);

        list.add(new Cat(29, "blue"));

//        list.get(0).purr();
        CanPurr someCat = list.get(0);
        someCat.purr();

        System.out.println("Этот кошак - кот?");
        System.out.println(someCat instanceof Cat);
        System.out.println("Этот кошак - тигр?");
        System.out.println(someCat instanceof Tiger);

//        list.get(1).purr();
        someCat = list.get(1);
        someCat.purr();

        if (someCat instanceof Animal)
            System.out.println(((Animal) someCat).getColor());
    }
}
