package org.example;

import java.util.Iterator;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Student student1= new Student("Anand",007,"BSE");
        Student student2= new Student("Omkar",108,"com");
        Student student3= new Student("Akash",102,"BE");
        Student student4= new Student("Nitesh",117,"MS");
        Student student5= new Student("Anand",222,"BEd");

        Map<Integer,Student> map = new java.util.HashMap<>();

        map.put(1,student1);
        map.put(2,student2);
        map.put(3,student3);
        map.put(4,student4);
        map.put(5,student5);

        for (Student std :map.values())
        {
            System.out.println(std);

        }

        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.toString());



    }
}
