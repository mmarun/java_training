package com.javaTutorials;

//String, All number wrapper classes,


import java.lang.reflect.Method;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("Arun", 1);
        map.put("Mahesh", 2);
        map.put("Rakesh", 3);
        map.put("Ranjit", 4);

        System.out.println(map);
        map.put("Ranjit", 19);

        System.out.println(map);

        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("Arun", new Student("Arun", 1, 1, 'F'));
        studentMap.put("Amit", new Student("Amit", 2, 2, 'B'));

        System.out.println(studentMap);

        Map<Student, String> invertedStudentMap = new HashMap<>();
        invertedStudentMap.put(new Student("Arun", 1, 1, 'F'), "Arun");
        invertedStudentMap.put( new Student("Amit", 2, 2, 'B'), "Amit");
        System.out.println(invertedStudentMap);

        for(Student std: invertedStudentMap.keySet()){
            System.out.println(std);
        }




    }
}

