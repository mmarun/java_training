package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

    private Employee employee;

    @Before
    public void init()
    {
        employee = new Employee("Varun",111,"CSE111",50000);
    }

    @Test
    public void Employee_positiveTest()
    {
        Employee emp1 = new Employee("Varun",111,"CSE111",50000);
        Assert.assertEquals(employee,emp1);
    }

    @Test
    public void Employee_negetiveTest()
    {
        Employee emp1 = new Employee("Amir",121,"CSE111",50000);
        Assert.assertNotEquals(employee,emp1);
    }

    @Test
    public void compareTo_positive()
    {
        Employee emp = new Employee("Varun",111,"CSE111",50000);
        Assert.assertTrue(employee.equals(emp));
    }

    @Test
    public void compareTo_negetive()
    {
        Employee emp = new Employee("Amir",113,"CSE121",50000);
        Assert.assertFalse(employee.equals(emp));
    }

    @Test
    public void setEmployeeName()
    {
        Employee emp = new Employee();
        emp.setFirstName("Vidyadhar");
        Assert.assertEquals("Vidyadhar",emp.getFirstName());
    }

    @Test
    public void setEmployeeId()
    {
        Employee emp = new Employee();
        emp.setEmpId(333);
        Assert.assertEquals(333,emp.getEmpId().intValue());
    }

    @Test
    public void setEmployeeSalary()
    {
        Employee emp = new Employee();
        emp.setEmpSalary(600000);
        Assert.assertEquals(600000,emp.getEmpSalary().intValue());
    }

    @Test
    public void Check_Diff_instance()
    {
        Integer e=500000;
        Assert.assertFalse(employee.equals(e));
    }

    @After
    public void tearDown()
    {
        employee=null;
    }
}