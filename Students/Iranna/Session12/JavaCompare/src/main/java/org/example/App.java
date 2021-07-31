package org.example;

/**
 * Hello world!
 *
 */

import java.util.*;


public class App
{

    public static void main( String[] args )
    {


        Employee employee1=new Employee("Abhi","S",102,2,25000);
        Employee employee2=new Employee("Kiran","N",103,2,35000);
        Employee employee3=new Employee("Sharan","B",105,2,17000);
        Employee employee4=new Employee("Akash","M",110,2,27000);
        ArrayList<Employee> arrayList=new ArrayList<>();
        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);
        arrayList.add(employee4);


        Collections.sort(arrayList);
        for (Employee e:arrayList) {
            System.out.println(e.toString());
        }

        Set<Employee> emp = new TreeSet<>(new ComparatorDemo());
        emp.add(employee1);
        emp.add(employee2);
        emp.add(employee3);
        emp.add(employee4);
        //  Collections.sort(emp, new ComparatorDemo());
        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        Collections.sort(list,new Salary());
        for(Employee e : emp){
            System.out.println(e);
        }

    }
}

