package org.example;

import java.util.*;

public class App 
{
    public static void main( String[] args ) {

        Employee emp1 = new Employee("Varun", 121, "CSE111", 35000);
        Employee emp2 = new Employee("Arun", 141, "CSE115", 50000);
        Employee emp3 = new Employee("Kiran", 131, "CSE161", 52000);
        Employee emp4 = new Employee("Sumit", 160, "CSE141", 25000);
        Employee emp5 = new Employee("Ravi", 123, "CSE118", 46000);

        ArrayList<Employee> arrList = new ArrayList<>();

        arrList.add(emp1);
        arrList.add(emp2);
        arrList.add(emp3);
        arrList.add(emp4);
        arrList.add(emp5);

        System.out.println("Arrays list elements based on insertion order");

        Iterator itr = arrList.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();
        System.out.println("Sorted ArrayList Elements based on EmployeeName ");
        Collections.sort(arrList);

        for (Employee emp : arrList) {
            System.out.println(emp.toString());
        }
        System.out.println();

        System.out.println("Sorting Elements Based on EmployeeId");
        List<Employee> list = new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        Collections.sort(list, new ComparatorExample());

        for (Employee emp : list) {
            System.out.println(emp);
        }
        System.out.println();

        System.out.println("Sorting Arraylist Elements based on Salary..........");

        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        emp.add(emp4);
        emp.add(emp5);

        Collections.sort(emp, new ComparatorOnSalary());
        for (Employee e : emp) {
            System.out.println(e);
        }

        System.out.println();
        System.out.println();

        TreeSet<Employee> treeSet = new TreeSet<>();
        treeSet.add(emp1);
        treeSet.add(emp2);
        treeSet.add(emp3);
        treeSet.add(emp4);
        treeSet.add(emp5);

        Iterator i = treeSet.iterator();

        while(i.hasNext())
        {
            System.out.println(i.next());

        }




    }

}
