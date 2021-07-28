package com.javaTutorials;

//String, All number wrapper classes,

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App
{
    public static void main( String[] args )
    {
        List<Integer> list = new ArrayList<Integer>(5);

        for(int i=0; i<6; i++){
            list.add(i);
            System.out.println("Size = " + list.size());
            System.out.println(list.get(i));
        }

        Set<Employee> employees = new TreeSet<Employee> ();

        Employee employee1 = new Employee(1, "Arun", "HR");
        Employee employee2 = new Employee(1, "Arun", "HR" );
        employees.add(employee1);
        employees.add(employee2);

        employees.stream().forEach(System.out::println);

        //in memory array for 5 elements..
        // 10 + 10 * 2/3 = 10, 16, 26, ....
        //16 * 2 =




    }
}

