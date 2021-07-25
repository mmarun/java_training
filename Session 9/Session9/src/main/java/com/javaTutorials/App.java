package com.javaTutorials;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //equals method
        //toString method
        //hashcode method

        Integer i = new Integer(10001);
        Integer k = new Integer(10002);

//        System.out.println(i.equals(k));
        k--;
 //       System.out.println(k.equals(i));

        Student student = new Student(1, "Arun", "Hyderabad");

        System.out.println(student.getName() + " " + student.getRollNumber() + " " + student.getCurrentLocation());

        student.setCurrentLocation("Mumbai");

        System.out.println(student.getName() + " " + student.getRollNumber() + " " + student.getCurrentLocation());
        System.out.println(student); //Name of class + hascode in hexadecimal string

        Student a = new Student(1, "Arun", "Delhi");
        Student b = new Student(1, "Arun", "Delhi");

        System.out.println(a == b);
        System.out.println(a.equals(b));

    }
}
