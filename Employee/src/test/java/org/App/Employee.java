package org.App;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Employee
{
    private Employee employee;

    public Employee(String komal, String das, String ssid002, String test)
    {

    }

    @Before
    public void init (){
     Employee   employee = new Employee( "komal", "das","SSID002", "test");
    }

    @Test
    public void check_if_same_instance_return_true(){
        Employee otherEmployee = employee;
        Assert.assertTrue(employee.equals(otherEmployee));
    }

    @Test
    public void check_if_different_type_return_false(){
        Employee otherEmployee = employee;
        Assert.assertFalse(employee.equals(otherEmployee));
    }

    @Test
    public void equals_positive_test(){
        Employee otherEmployee = new Employee("dinga", "joo", "SSID00124","devop");
        Assert.assertTrue(employee.equals(otherEmployee));
    }

    @Test
    public void equals_negative_test() {
        Employee otherEmployee = new Employee("dodo", "Rai", "SSID1234","test");
        Assert.assertFalse(employee.equals(otherEmployee));
    }
}
