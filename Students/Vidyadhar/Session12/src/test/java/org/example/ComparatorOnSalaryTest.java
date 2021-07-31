package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComparatorOnSalaryTest {

    private Employee employee1;
    private Employee employee2;

    @Before
    public void setUp() throws Exception {
        employee1 = new Employee("Varun",777,"ECE555",70000);
        employee2 = new Employee("Amir",222,"ISE333",50000);

    }

    @Test
    public void equallSalary()
    {
        employee2.setEmpSalary(70000);
        int result =employee1.getEmpSalary().compareTo(employee2.getEmpSalary());
        Assert.assertTrue(result==0);
    }


    @Test
    public void greterSalary() {
        int result = employee1.getEmpSalary().compareTo(employee2.getEmpSalary());
        Assert.assertTrue(result>=1);
    }

    @Test
    public void lessSalary(){
        int result = employee2.getEmpSalary().compareTo(employee1.getEmpSalary());
        Assert.assertTrue(result<=-1);
    }

    @After
    public void tearDown() throws Exception {
        employee1 = null;
        employee2 = null;
    }
}