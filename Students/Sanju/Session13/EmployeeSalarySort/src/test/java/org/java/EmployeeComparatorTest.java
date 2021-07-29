package org.java;

import org.junit.*;


import static org.junit.Assert.*;

public class EmployeeComparatorTest {

   Employee employee1;
   Employee employee2;

   @Before
    public void setUp() throws Exception {
        employee1=new Employee(100,"Sanju", "Deployment",50000);
   }


    @Test
    public void salaryGreaterThanTest() {
        employee2=new Employee(101,"Mathew","Depolyment", 75000);
        int greater=employee2.getEmpSalary().compareTo(employee1.getEmpSalary());
        Assert.assertTrue("Expected Greater than",greater==1);

    }
    @Test
    public void salaryLessThanTest() {
        employee2=new Employee(101,"Mathew","Depolyment", 15000);
        int less=employee2.getEmpSalary().compareTo(employee1.getEmpSalary());
        Assert.assertTrue("Expected Less than",less< 1);

    }

}