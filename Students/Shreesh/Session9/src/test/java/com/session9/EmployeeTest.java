package com.session9;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest
{
    private Employee employee;

    @Before
    public void init()
    {
        employee= new Employee("Shreesh","Joshi",152,4);
    }

    @Test
    public void check_if_same_instance_return_true()
    {
        Employee employee1=employee;
        Assert.assertTrue(employee.equals(employee1));
    }

    @Test
    public void equals_positive_test()
    {
        Employee employee1=new Employee("Shreesh","Joshi",152,4);
        Assert.assertTrue(employee.equals(employee1));
    }

    @Test
    public void equals_negative_test()
    {
        Employee employee1=new Employee("Vikrant","Sathe",158,3);
        Assert.assertFalse(employee.equals(employee1));
    }

    @Test
    public void  check_if_different_type_returns_false()
    {
        String name="Shreesh";
        Assert.assertFalse(employee.equals(name));
    }
}