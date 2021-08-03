package com.java;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {


    Employee employeeTest;
    Employee employee2;
    @Before
    public void setUp() {
        employeeTest =new Employee("Amrutha","sudheesh",101,2,10000);


    }
    @Test
    public void positiveTestEmployee()
    {
        Employee emp=new Employee("Amrutha","sudheesh",101,2,10000);
        Assert.assertTrue(emp.equals(employeeTest));
    }
    @Test
    public void negetiveTestEmployee()
    {
        Employee emp=new Employee("sudheesh","K",106,2,10000);
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