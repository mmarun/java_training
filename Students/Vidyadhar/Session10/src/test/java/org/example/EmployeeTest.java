package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

    private Employee emp;

    @Before
    public void init()
    {
        emp = new Employee("Varun","HR",101,"CSE123");
    }

    @Test
    public void check_same_instance_return_true()
    {
        Employee otherEmp = emp;
        Assert.assertTrue(emp.equals(otherEmp));
    }

    @Test
    public void check_if_diff_return_false()
    {
        double fl1 = 23.34;
        Assert.assertFalse(emp.equals(fl1));
    }

    @Test
    public void equals_positive_test()
    {
        Employee emp1 = new Employee("Varun","HR",101,"CSE123");
        Assert.assertTrue(emp.equals(emp1));
    }

    @Test
    public void equals_negetive_test()
    {
        Employee emp1 = new Employee("Darshan","TS",102,"CSE456");
        Assert.assertFalse(emp.equals(emp1));
    }
}
