package com.hashMap;
import java.util.*;

public class Runner
{
    public static void main(String[] args)
    {
        Employee emp1=new Employee(101,"Shreesh","IT",56000.00,"Pune");
        Employee emp2=new Employee(105,"Akshay","Account",38000.00,"Satara");
        Employee emp3=new Employee(103,"Shripad","Account",42000.00,"Barshi");
        Employee emp4=new Employee(102,"Nishant","Admin",17000.00,"Jalgaon");
        Employee emp5=new Employee(104,"Sagar","Admin",21000.00,"Pune");
        Employee emp6=new Employee(106,"Vikrant","IT",51000.00,"Baramati");
        Employee emp7=new Employee(110,"Amar","Design",35000.00,"Shegaon");
        Employee emp8=new Employee(108,"Vinod","Desing",32000.00,"Dhule");
        Employee emp9=new Employee(107,"Harshal","Costing",24000.00,"Malegaon");
        Employee emp10=new Employee(109,"Prasad","Costing",21000.00,"Mumbai");
        Employee emp11=new Employee(111,"Amit","Production",16000.00,"Nagpur");
        Employee emp12=new Employee(115,"Shekhar","Marketing",43000.00,"Shirdi");
        Employee emp13=new Employee(113,"Sumedh","Sales",34000.00,"Beed");
        Employee emp14=new Employee(112,"Nahush","Marketing",29000.00,"Sangli");
        Employee emp15=new Employee(114,"Sharad","Sales",22000.00,"Jalana");
        Employee emp16=new Employee(116,"Prashant","Production",15000.00,"Parbhani");

        Map<Integer,Employee>employeeMap=new HashMap<>();
        employeeMap.put(emp1.getEmpid(),emp1);
        employeeMap.put(emp2.getEmpid(),emp2);
        employeeMap.put(emp3.getEmpid(),emp3);
        employeeMap.put(emp4.getEmpid(),emp4);
        employeeMap.put(emp5.getEmpid(),emp5);
        employeeMap.put(emp6.getEmpid(),emp6);
        employeeMap.put(emp7.getEmpid(),emp7);
        employeeMap.put(emp8.getEmpid(),emp8);
        employeeMap.put(emp9.getEmpid(),emp9);
        employeeMap.put(emp10.getEmpid(),emp10);
        employeeMap.put(emp11.getEmpid(),emp11);
        employeeMap.put(emp12.getEmpid(),emp12);
        employeeMap.put(emp13.getEmpid(),emp13);
        employeeMap.put(emp14.getEmpid(),emp14);
        employeeMap.put(emp15.getEmpid(),emp15);
        employeeMap.put(emp16.getEmpid(),emp16);

        for(Employee emp :employeeMap.values()) {
            System.out.println(emp);
        }


    }
}
