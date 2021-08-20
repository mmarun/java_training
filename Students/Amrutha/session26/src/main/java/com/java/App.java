package com.java;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    static Logger log = Logger.getLogger(App.class.getName());

    public static void main( String[] args )
    {
        List<String> listNames= Arrays.asList("Amrutha","Sinu","Anil","Sudhi");
        //use of function
        Function<String,String> concateNames=(name)-> {
            return "Hi Arun: " + name;
        };
        for (String name:listNames)
        {
            System.out.println("Concatenated strings:"+concateNames.apply(name));
        }
        //use of predicate

       List<Employee> listEmployees=new ArrayList<>();
        Employee emp1=new Employee(101,"Anu",21,10000);
        Employee emp2=new Employee(102,"Minu",28,20000);
        Employee emp3=new Employee(103,"Jithu",25,15000);
        Employee emp4=new Employee(104,"Kiran",29,22000);
        listEmployees.add(emp1);
        listEmployees.add(emp2);
        listEmployees.add(emp3);
        listEmployees.add(emp4);
        List<Employee> filterEmployeeOnSalary=new ArrayList<>();
        Predicate<Employee> empAge=(Employee)-> {
           if(Employee.getAge()>25)
           {
               return true;
           }
           else
               return false;
        };

        Boolean status=listEmployees.stream().anyMatch(employee -> employee.getSalary()>10000);
        System.out.println(status);
        listEmployees.stream().filter(emp->emp.getSalary()>15000).collect(Collectors.toList());
        for (Employee e:listEmployees)
        {
            System.out.println(e.getName());
        }
        listEmployees.stream().filter(empAge).collect(Collectors.toList());
        for (Employee e:listEmployees)
        {
            System.out.println(e.getName());
        }


    }
}
