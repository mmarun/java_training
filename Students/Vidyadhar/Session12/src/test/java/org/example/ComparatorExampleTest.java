package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComparatorExampleTest {

    private Employee Emp1;
    private Employee Emp2;

    @Before
    public void setUp() throws Exception {
        Emp1 = new Employee("Varun",999,"CSE222",40000);
        Emp2 = new Employee("Ravi",444,"CSE555",30000);
    }

    @Test
    public void compareEquall()
    {
        Emp2 = new Employee("Varun",999,"CSE222",40000);
        int result=Emp1.compareTo(Emp2);
        Assert.assertTrue(result==0);
    }

    @Test
    public void compareGreaterthan()
    {
        int result = Emp1.compareTo(Emp2);
        Assert.assertTrue(result>=1);
    }

    @Test
    public void compareNotGreaterthan()
    {
        int result = Emp1.compareTo(Emp2);
        Assert.assertFalse(result<=1);
    }

    @Test
    public void compareLessthan()
    {
        int result = Emp2.compareTo(Emp1);
        Assert.assertTrue(result<=-1);
    }

    @Test
    public void compareNotLessthan()
    {
        int result = Emp2.compareTo(Emp1);
        Assert.assertFalse(result>=1);
    }

    @After
    public void tearDown() throws Exception {
        Emp1=null;
        Emp2=null;
    }
}