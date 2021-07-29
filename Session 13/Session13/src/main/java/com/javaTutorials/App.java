package com.javaTutorials;

//String, All number wrapper classes,


import java.lang.reflect.Method;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {


        // List & Set..
        //Collection is root interface - No Direct child for collection
        // List and Set interfaces.
        //List - Allows duplicates, allows null, maintains insertion order ..
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(null);
        arrayList.add(12);


        System.out.println("Printing arrayList");
        for(Integer k : arrayList)
             System.out.print(" " + k);
        System.out.println("");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(5);

        treeSet.add(12);

        System.out.println("Printing out Set ");
        for(Integer i: treeSet) {
            System.out.print(" " + i);
        }
        System.out.println("");

        //Lombok coverage..
        Student student = new Student("Arun", 1, 4, 'A');
        Student student1 = new Student("Arun", 1, 4, 'A');
        for(Method method : student.getClass().getMethods()) {
            System.out.println(method.getName());
        }

        System.out.println(student);
        System.out.println(student.equals(student1));
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());

        Student student2 = new Student("Mohan", 7, 3, 'C');
        Student student3 = new Student("Vyankatesh", 19, 3, 'C');
        Student student4 = new Student("Balaji", 18, 3, 'C');
        Student student5 = new Student("Janardan", 33, 3, 'C');

        Set<Student> students = new TreeSet<>(new StudentComparator());
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student3);

        for(Student studentt : students){
            System.out.println(studentt);
        }

    }
}

