package org.maven.java;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee employee1=new Employee("Amrutha","Sudheesh",101,2);
        Employee employee2=employee1;
        System.out.println(employee1.toString());
        System.out.println(employee1.equals(employee2));


    }
}
