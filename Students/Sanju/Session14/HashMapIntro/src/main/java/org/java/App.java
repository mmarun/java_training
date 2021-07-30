package org.java;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

       Map<String,Employee> employeeMap=new HashMap<>();
        employeeMap.put("Sanju", new Employee(100,"Sanju","Development",50000));
        employeeMap.put("Sachin", new Employee(101,"Sachin","Development",55000));
        employeeMap.put("Vineeth", new Employee(102,"Vineeth","HR",65000));
        employeeMap.put("Amit", new Employee(103,"Amit","Deployment",55000));
        employeeMap.put("Remya", new Employee(104,"Remya","HR",50000));


        for(Employee emp: employeeMap.values()){
            System.out.println(emp);
        }

        System.out.println(employeeMap.getClass().hashCode());
    }
}
