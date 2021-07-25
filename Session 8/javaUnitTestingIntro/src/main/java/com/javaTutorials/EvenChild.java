package com.javaTutorials;

public class EvenChild extends Parent {


    @Override
    public void printMessage(Integer value) {
        //super.printMessage(message);
        System.out.println(" In Even class " + value);
    }
}
