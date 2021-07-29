package org.java;

import javafx.scene.effect.SepiaTone;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //Lombok Introduction
        Employee employee1=new Employee(100,"Sanju","Deployment",50000);
        Employee employee2=new Employee(104,"Bhagya","HR",85000);
        Employee employee3=new Employee(105,"Tanu","Test",40000);
        Employee employee4=new Employee(103,"Suchi","Deployment",100000);
       // Employee employee=new Employee(100,"Sanju","Deployment",50000);

        Set<Employee> employees=new TreeSet<Employee>(new EmployeeComparator()) ;

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        System.out.println("Sorting according to Salary");
        for(Employee emp:employees){
            System.out.println(emp);
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Sorting according to Name ");
        Set<Employee> employee=new TreeSet<Employee>();
        employee.add(employee1);
        employee.add(employee2);
        employee.add(employee3);
        employee.add(employee4);

        for(Employee emp:employee){
            System.out.println(emp);
        }
    }
}
