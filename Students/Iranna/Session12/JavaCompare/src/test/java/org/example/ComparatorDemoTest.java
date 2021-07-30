package org.example;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComparatorDemoTest {
    @Test
    public void positiveTestComparator()
    {
        Employee employee1=new Employee("Abhi","S",102,2,25000);
        Employee employee2=new Employee("Abhi","S",102,2,25000);
        int status=employee1.compareTo(employee2);
        Assert.assertTrue(status==0);
    }
    @Test
    public void testGreaterThan() {
        Employee employee1=new Employee("Sumedh","N",108,2,25000);
        Employee employee2=new Employee("Akash","N",108,2,25000);
        int status=employee1.compareTo(employee2);
        Assert.assertTrue("expected to be greater than", status >= 1);
    }

    @Test
    public void testLessThan() {
        Employee employee1 = new Employee("Akash", "S", 108, 2, 25000);
        Employee employee2 = new Employee("Sumedh", "n", 108, 2, 25000);
        int status = employee1.compareTo(employee2);
        assertTrue("expected to be less than", status <= -1);
    }
}

