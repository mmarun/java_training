package com.javaTutorials;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Student student = new Student(1, "Arun", "Hyderabad", "First");

        System.out.println(student.getName() + " " + student.getRollNumber() + " " + student.getCurrentLocation());
        student.setCurrentLocation("Mumbai");

        System.out.println(student.getName() + " " + student.getRollNumber() + " " + student.getCurrentLocation());
        System.out.println(student); //Name of class + hashcode in hexadecimal string

        Student a = new Student(1, "Arun", "Delhi", "First");
        Student b = new Student(1, "Arun", "Delhi", "First");

        System.out.println(a == b);
        System.out.println(a.equals(b));

        //If two objects are equal then their hashcode should be equal
        //If two objects have their hashcode as equal then their objects may or may not be equal


        System.out.println(b.hashCode());
        System.out.println(a.hashCode());


    }
}
