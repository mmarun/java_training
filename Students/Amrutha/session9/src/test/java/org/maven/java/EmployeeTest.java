package org.maven.java;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest extends TestCase {

    Employee employeeTest;
    @Before
    public void setUp()
    {
        employeeTest =new Employee("Amrutha","sudheesh",101,2);
    }
    @Test
    public void positiveTestEmployee()
    {
        Employee emp=new Employee("Amrutha","sudheesh",101,2);
        Assert.assertTrue(emp.equals(employeeTest));
    }
    @Test
    public void negativeTestEmployee()
    {
        Employee emp=new Employee("Sudheesh","K",106,2);
        Assert.assertFalse(emp.equals(employeeTest));
    }
    @Test
    public void checkSameInstanceType_return()
    {
        Employee emp=employeeTest;
        Assert.assertTrue(emp.equals(employeeTest));
    }
    @Test
    public void checkDifferntType_return()
    {
       Integer a=23;
        Assert.assertFalse(employeeTest.equals(a));
    }
    @After
    public void tearDown()
    {
        employeeTest=null;

    }
}