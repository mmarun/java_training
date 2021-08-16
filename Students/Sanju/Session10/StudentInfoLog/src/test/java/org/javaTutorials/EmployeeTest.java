package org.javaTutorials;

import org.junit.After;
import org.junit.Before;
import org.junit.*;

public class EmployeeTest {

    Employee employee;

    @Before
    public void setUp() throws Exception {
        employee=new Employee(1010,"Sanju","Mathew","Test");
    }

    @Test
    public void empPositiveTest() {
        Employee other_employee=new Employee(1010,"Sanju", "Mathew", "Test");
        Assert.assertTrue(other_employee.equals(employee));
    }

    @Test
    public void empNegativeTest() {
        Employee other_employee=new Employee(1011,"Ramya","Jha","IT");
        Assert.assertFalse(other_employee.equals(employee));
    }

    @Test
    public void checkSameInstanceType_return() {
        Employee emp = employee;
        Assert.assertTrue(emp.equals(employee));

    }


    @After
    public void tearDown() throws Exception {
        employee=null;
    }

    @Test
    public void positiveHashcodeCheck() {
        Employee emp=new Employee(1010,"Sanju","Mathew","Test");
        Assert.assertEquals(employee.hashCode(),emp.hashCode());

    }

    @Test
    public void negativeHashcodeCheck() {
        Employee emp=new Employee(1011,"Ramya","Jha","Test");
        Assert.assertNotEquals(employee.hashCode(),emp.hashCode());
    }

}