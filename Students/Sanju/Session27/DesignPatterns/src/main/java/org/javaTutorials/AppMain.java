package org.javaTutorials;

public class AppMain {

    public static void main( String[] args ) {

        Student student= new Student("Sanju",101);
        Student student1=new Student("Mathew", 150);

        System.out.println("Name=="+student.name);

        StudentInfo studentInfo=new StudentInfo();
        studentInfo.addStudent(student);

        System.out.println("ID=="+studentInfo.getstudentId(150));


    }
}
