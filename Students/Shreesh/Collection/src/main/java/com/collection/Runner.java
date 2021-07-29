package com.collection;
import java.lang.reflect.Method;
import java.util.*;

public class Runner
{
    public static void main(String[] args)
    {
        Employee empFirst=new Employee(101,"Shreesh","IT",35000.00,"Pune");
        Employee empSecond=new Employee(105,"Akshay","IT",56000.00,"Satara");
        Employee empThird=new Employee(103,"Shripad","IT",42000.00,"Barshi");
        Employee empFourth=new Employee(102,"Nishant","IT",17000.00,"Jalgaon");
        Employee empFifth=new Employee(102,"Shreesh","IT",35000.00,"Pune");

        for (Method method: empFirst.getClass().getMethods())
        {
            System.out.println(method.getName());
        }
        System.out.println(empFirst.getEmpName());

        Set<Employee> employees = new TreeSet<>(new EmployeeComparator());
        employees.add(empFirst);
        employees.add(empSecond);
        employees.add(empThird);
        employees.add(empFourth);
        employees.add(empFifth);

        System.out.println("Printing Set...........");

        for (Employee employee: employees)
        {
            System.out.println(employee.getEmpName());
        }

    }
}
