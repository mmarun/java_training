package org.example;


public class App 
{
    public static void main( String[] args )
    {
        Employee employee1 = new Employee();


        System.out.println(employee1.getFirstName() +" "+employee1.getLastName() +" "+
                employee1.getEmployeeId()+" "+employee1.getEmployeeDeptId());

        employee1.setLastName("BS");
        employee1.setDept_Id("ECE001");

        System.out.println(employee1.getFirstName() +" "+employee1.getLastName() +" "+
                employee1.getEmployeeId()+" "+employee1.getEmployeeDeptId());

        Employee employee2 = new Employee("Shivu","HM",105,"ISE002");
        Employee employee3 = new Employee("Shivu","HM",105,"ISE002");

        System.out.println(employee2 == employee3);
        System.out.println(employee2.equals(employee3));

        System.out.println(employee1.getFirstName() +" "+employee1.getLastName() +" "+
                employee1.getEmployeeId()+" "+employee1.getEmployeeDeptId());



        System.out.println(employee2.hashCode());
        System.out.println(employee3.hashCode());

    }
}
