package com.training;

public class MyCoolException extends Exception {
    @Override
    public String getMessage() {
        return "Привет";
    }
}
