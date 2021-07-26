package com.java;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    static Logger log = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {

        Employee employee1=new Employee("Amrutha","Sudheesh",101,2);
        Employee employee2=employee1;
        log.info("Employee created");
        System.out.println(employee1.toString());
        System.out.println(employee1.equals(employee2));


    }
}
