package org.javaTutorials;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



/**
 * Hello world!
 *
 */


public class App 
{
    static final Logger logger= LogManager.getLogger(App.class );
    public static void main( String[] args )
    {
        /**
         *  Student Class
         */

        logger.trace("Started Tracing");
        Student student1= new Student(1,"Amrutha","Bangalore");
        System.out.println(student1.getRollNumber()+" "+ student1.getStudentName()+ " "+ student1.getLocation());

        Student student2=new Student(1,"Amrutha","Bangalore");
        Student student3=new Student(2,"Sanju","Kerala");

        System.out.println(student1.equals(student2));

        //System.out.println(student1.equals(student3));

        /**
         * Employee
         */

        Employee employee=new Employee(1010,"Sanju","Mathew","Test");
        System.out.println(employee.getEmployeeId()+" "+employee.getFirstName()+" "+employee.getLastName()+" " +employee.getDeptId());

    }
}
