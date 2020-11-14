package com.training;

public class Bear extends Animal {

    public Bear() {}
    public Bear(int age) { super(age); }
    public Bear(int age, String color) { super(age, color); }

    public void roar(int what) throws MyCoolException {
        System.out.println("ROAR!");

        if (what < 0)
            throw new MyCoolException();
    }
}
