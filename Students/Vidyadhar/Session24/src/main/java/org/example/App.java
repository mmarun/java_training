package org.example;


import org.example.FunctionalInterface.Functionable;
import org.example.FunctionalInterface.Student;
import org.example.FunctionalInterface.StudentInfo;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args ) {

        //Using Functionable interface reference Creating StdentInfo Class object
        Functionable student = new StudentInfo();

        //Using Student interface reference Creating StdentInfo Class object
        Student Student1 = new StudentInfo();

        //Calling Functionable interface overridden display method
        student.display();

        //Calling Student interface overridden studentInfo()
        System.out.println(Student1.studentInfo());

        //Calling Student Interface default Methods
       Student1.collegeFee();

       //Calling Student Interface Static method
        System.out.println(Student.add(25,25));
        System.out.println(Student.studentName("Anand"));
        System.out.println(Student.collegeName());

    }
}
