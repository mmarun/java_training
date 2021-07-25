package com.javaTutorials;

public class OddChild extends Parent{
    @Override
    public void printMessage(Integer value) {
        System.out.println(" In Odd  Child " + value);
    }
}
