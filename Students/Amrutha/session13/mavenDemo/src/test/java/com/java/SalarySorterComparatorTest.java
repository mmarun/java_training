package com.java;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SalarySorterComparatorTest {

    @Test
    public void positiveTestComparator()
    {
        SalarySorterComparator salarySorterComparatorTest=new SalarySorterComparator();
        Employee employee1=new Employee("Sudheesh","S",108,2,25000);
        Employee employee2=new Employee("Sudheesh","S",108,2,25000);
        int status=salarySorterComparatorTest.compare(employee1,employee2);
        Assert.assertTrue(status==0);
    }
    @Test
    public void testGreaterThan() {
        Employee employee1=new Employee("Sudheesh","S",108,2,50000);
        Employee employee2=new Employee("Amrutha","S",108,2,25000);
        SalarySorterComparator salarySorterComparatorTest=new SalarySorterComparator();
        int status=salarySorterComparatorTest.compare(employee2,employee1);
        Assert.assertTrue("expected to be greater than", status >= 1);
    }

    @Test
    public void testLessThan() {
        Employee employee1 = new Employee("Amrutha", "S", 108, 2, 25000);
        Employee employee2 = new Employee("Sudheesh", "S", 108, 2, 35000);
        SalarySorterComparator salarySorterComparatorTest=new SalarySorterComparator();
        int status=salarySorterComparatorTest.compare(employee2,employee1);
        Assert.assertTrue("expected to be less than", status <= -1);
    }
}