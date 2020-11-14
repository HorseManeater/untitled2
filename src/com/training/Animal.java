package com.training;


public class Animal {

    private int age;
    private String color;

    public Animal (int age, String color) {
        this.age = age;
        this.color = color;
    }

    public Animal (int age) {
        this.age = age;
        this.color = "black";
    }

    public Animal () {
        this.color = "grey";
    }

    public int getAge() {
        if (age >= 0)
            return age;
        else
            return 0;
    }

    public boolean setAge(int age) {
        if (age >= 0)
            this.age = age;
        else
            return false;
        return true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
