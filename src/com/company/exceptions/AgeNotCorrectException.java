package com.company.exceptions;

public class AgeNotCorrectException extends Exception {
    String s ="";
    public AgeNotCorrectException(String s) {
        this.s =s;
    }
}
