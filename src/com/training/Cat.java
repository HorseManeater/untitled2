package com.training;

public class Cat extends Animal implements CanPurr {

    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat(int age) {
        super(age);
    }

    public Cat() {
    }

    @Override
    public void purr() {
        System.out.println("purrrr");
    }
}
