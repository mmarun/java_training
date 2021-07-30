package org.example;



import org.junit.Assert;
import org.junit.Test;

public class SalaryTest {

    @Test
    public void positiveTestComparator()
    {
        Salary salarySorterComparatorTest=new Salary();
        Employee employee1=new Employee("Abhi","S",102,2,25000);
        Employee employee2=new Employee("Abhi","S",102,2,25000);
        int status=salarySorterComparatorTest.compare(employee1,employee2);
        Assert.assertTrue(status==0);
    }
    @Test
    public void testGreaterThan() {
        Employee employee1=new Employee("Srikant","S",107,2,50000);
        Employee employee2=new Employee("Anil","S",107,2,25000);
        Salary salarySorterComparatorTest=new Salary();
        int status=salarySorterComparatorTest.compare(employee2,employee1);
        Assert.assertTrue("expected to be greater than", status >= 1);
    }

    @Test
    public void testLessThan() {
        Employee employee1 = new Employee("Anil", "S", 107, 2, 25000);
        Employee employee2 = new Employee("Srikant", "S", 107, 2, 50000);
        Salary salarySorterComparatorTest=new Salary();
        int status=salarySorterComparatorTest.compare(employee2,employee1);
        Assert.assertTrue("expected to be less than", status <= -1);
    }
}

