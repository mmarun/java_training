package org.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class EmployeeTest {

    Employee emp;
    Employee emp2;
    @Before
    public void setUp() throws Exception {
        emp=new Employee(100,"Sanju","Development",50000);
    }

    @After
    public void tearDown() throws Exception {
        emp=null;
    }


    @Test
    public void positiveTestEmployee() {
        emp2=new Employee(100,"Sanju","Development",50000);
        Assert.assertTrue(emp2.equals(emp));
    }

    @Test
    public void positiveNegativeEmployee() {
        emp2=new Employee(101,"Sachin","Development",60000);
        Assert.assertFalse(emp2.equals(emp));
    }
}