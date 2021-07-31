package com.hashMap;

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
        employee=new Employee(12,"shreesh","IT",35000.00,"pune");
    }
    @Test
    public void check_if_same_instance_return_true(){
        Employee employee1 = employee;
        Assert.assertTrue(employee.equals(employee1));
    }

    @Test
    public void check_if_different_type_return_false(){
        Double dbl = 13.5;
        Assert.assertFalse(employee.equals(dbl));
    }

    @Test
    public void equals_positive_test(){
        Employee employee1 = new Employee(12,"shreesh","IT",35000.00,"pune");
        Assert.assertTrue(employee.equals(employee1));
    }

    @Test
    public void equals_negative_test() {
        Employee employee1 = new Employee(10, "Shripad", "Sales",34000.00,"Barshi");
        Assert.assertFalse(employee.equals(employee1));
    }

}