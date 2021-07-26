package org.example;


public class App 
{
    public static void main( String[] args )
    {
        Student S1 = new Student();

        Employee emp1 = new Employee("Varun","HR",101,"EC456");

        System.out.println(emp1.getEmp_fname()+" "+emp1.getEmp_lname()+" "+emp1.getEmp_Id()+" "+emp1.getDept_Id());

        emp1.setDept_Id("CSE123");
        System.out.println(emp1.getEmp_fname()+" "+emp1.getEmp_lname()+" "+emp1.getEmp_Id()+" "+emp1.getDept_Id());
        System.out.println(emp1);

        Employee E1 = new Employee("Nitesh","Ap",103,"CSE111");
        Employee E2 = new Employee("Neela","CS",106,"CSE101");

        System.out.println(E1 == E2);
        System.out.println(E1.equals(E2));
    }
}
