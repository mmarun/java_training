package org.java;

import org.junit.*;

import static org.junit.Assert.*;

public class EmployeeTest {

    Employee employeeTest;
    @Before
    public void setUp() throws Exception {
    employeeTest=new Employee(100,"Sanju","Deployment", 50000);
    }

    
    @After
    public void tearDown() throws Exception {
    employeeTest=null;
    }

    @Test
    public void employeePositiveTest() {
        Employee employee=new Employee(100,"Sanju","Deployment",50000);
        Assert.assertTrue(employee.equals(employeeTest));
    }
    @Test
    public void employeeNegativeTest() {
        Employee employee=new Employee(101,"Mathew","Deployment",70000);
        Assert.assertFalse(employee.equals(employeeTest));
    }
}