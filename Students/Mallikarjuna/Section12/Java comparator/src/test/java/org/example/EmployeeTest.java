package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {


    Employee employeeTest;
    Employee employee2;
    @Before
    public void setUp() {
        employeeTest =new Employee("Brunu","M",110,2,27000);


    }
    @Test
    public void positiveTestEmployee()
    {
        Employee emp=new Employee("Irshad","M",110,2,27000);
        Assert.assertTrue(emp.equals(employeeTest));
    }
    @Test
    public void negativeTestEmployee()
    {
        Employee emp=new Employee("Brunu","K",106,2,10000);
        Assert.assertFalse(emp.equals(employeeTest));
    }
    @Test
    public void checkSameInstanceType_return()
    {
        Employee emp=employeeTest;
        Assert.assertTrue(emp.equals(employeeTest));
    }
    @Test
    public void checkDifferentType_return()
    {
        Integer a=23;
        Assert.assertFalse(employeeTest.equals(a));
    }
    @Test
    public void positiveCheckHashcodeSameObject()
    {
        Employee emp=new Employee("Brunu","M",110,2,27000);
        Assert.assertEquals(employeeTest.hashCode(),emp.hashCode());
    }
    @Test
    public void negativeCheckHashcodeSameObject()
    {
        Employee emp=new Employee("Irshad","K",106,2,10000);
        Assert.assertNotEquals(employeeTest.hashCode(),emp.hashCode());
    }
    @Test
    public void stringTest()
    {
        Employee emp=new Employee("Brunu","K",106,2,10000);
        Assert.assertNotNull(emp.toString());
    }
    @Test
    public void firstNameTest()
    {
        employee2=new Employee();
        employee2.setFirstName("Irshad");
        Assert.assertEquals("Irshad",employee2.getFirstName());
    }
    @Test
    public void lastNameTest()
    {
        employee2=new Employee();
        employee2.setLastName("K");
        Assert.assertEquals("K",employee2.getLastName());
    }
    @Test
    public void empidTest()
    {
        employee2=new Employee();
        employee2.setEmpId(103);
        Assert.assertEquals(103,employee2.getEmpId().intValue());
    }
    @Test
    public void deptidTest()
    {
        employee2=new Employee();
        employee2.setDeptId(2);
        Assert.assertEquals(2,employee2.getDeptId().intValue());
    }
    @After
    public void tearDown() {
        employeeTest=null;

    }
}