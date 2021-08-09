package com.javaTutorials.interfaces;

public interface Learnable {

    static Integer add(Integer a, Integer b){
        return a + b;
    }

    default String getInfo() {
        return "Interface default implementation";
    }

    default String getSchool() {
        return "Online Classes";
    }

    //public abstract
    void learn();
}
