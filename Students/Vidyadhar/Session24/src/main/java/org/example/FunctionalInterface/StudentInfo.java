package org.example.FunctionalInterface;

public class StudentInfo implements Functionable,Student{
    @Override
    public void display() {
        System.out.println(Student.studentName("Anand") +" "+Student.collegeName());
    }

    @Override
    public String studentInfo() {
        return (Student.studentName("Vidyadhar") +" "+Student.collegeName()+" Fee "+collegeFee()).toString();
    }
}
