package com.session9;

public class Runner
{
    public static void main(String[] args)
    {
        Employee employee = new Employee("Shripad", "Kulkarni", 13, 5);

        System.out.println(employee.getFirstName()+" "+ employee.getLastName());

        employee.setFirstName("Shreesh");
        employee.setLastName("Joshi");

        System.out.println(employee);

        Employee employee1=new Employee("Amar","Bhagat",13,5);
        Employee employee2=new Employee("Amar","Bhagat",13,5);

        System.out.println(employee1==employee2);
        System.out.println(employee1.equals(employee2));
        System.out.println(employee.equals(employee1));

    }

}
