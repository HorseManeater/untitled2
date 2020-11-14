package com.training;

public class Tiger extends Animal implements CanPurr {

    public Tiger(int age, String color) {
        super(age, color);
    }

    public Tiger(int age) {
        super(age);
    }

    public Tiger() {
    }

    @Override
    public void purr() {
        System.out.println("PURRRRRR");
    }
}
