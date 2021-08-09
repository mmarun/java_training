package org.javaTutorials;

public class Student implements StudentInterface{

    @Override
    public void learn() {
        System.out.println("Student Info Implementation");
    }

    @Override
    public String getStudName() {
        return StudentInterface.super.getStudName();
    }

    @Override
    public Integer getStudId() {
        return StudentInterface.super.getStudId();
    }
}
