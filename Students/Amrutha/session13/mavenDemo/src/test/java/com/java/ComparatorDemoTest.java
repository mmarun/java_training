package com.java;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComparatorDemoTest {
    @Test
    public void positiveTestComparator()
    {
        Employee employee1=new Employee("Sudheesh","S",108,2,25000);
        Employee employee2=new Employee("Sudheesh","S",108,2,25000);
        int status=employee1.compareTo(employee2);
        Assert.assertTrue(status==0);
    }
    @Test
    public void testGreaterThan() {
        Employee employee1=new Employee("Sudheesh","S",108,2,25000);
        Employee employee2=new Employee("Amrutha","S",108,2,25000);
        int status=employee1.compareTo(employee2);
        Assert.assertTrue("expected to be greater than", status >= 1);
    }

    @Test
    public void testLessThan() {
        Employee employee1 = new Employee("Amrutha", "S", 108, 2, 25000);
        Employee employee2 = new Employee("Sudheesh", "S", 108, 2, 25000);
        int status = employee1.compareTo(employee2);
        assertTrue("expected to be less than", status <= -1);
    }
}