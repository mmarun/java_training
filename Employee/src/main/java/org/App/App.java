package org.App;


public class App 
{
    public static void main( String[] args )
    {


        Employee employee = new Employee( "Mallikarjuna", "KM","SSIT002", "develop");

        System.out.println(employee.getFirstNAME() + " " + employee.getLastNAME() + " " + employee.getEmpID()+""+employee.getDptID());

        employee.setLastNAME("kampa");

        System.out.println(employee.getFirstNAME() + " " + employee.getLastNAME() + " " + employee.getEmpID()+""+employee.getDptID());
        System.out.println(employee); //Name of class + hascode in hexadecimal string

        Employee a = new Employee("Monappa", "K","SSID0056", "testing");
        Employee b = new Employee( "komal", "das","SSID002", "devop");

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
