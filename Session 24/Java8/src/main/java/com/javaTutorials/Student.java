package com.javaTutorials;

import com.javaTutorials.interfaces.Learnable;

public class Student implements Learnable {
    @Override
    public void learn() {
        System.out.println("Student learn implementation");
    }
}
