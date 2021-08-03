package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    private Student student1;
    private Student student2;
    @Before
    public void setUp() throws Exception {
        student1 = new Student("Anand",121,"BE");
    }

    @Test
    public void testEquals() {
        student2 = new Student("Anand",121,"BE");
        Assert.assertTrue(student1.equals(student2));
    }

    @Test
    public void testNotEquals(){
        student2 = new Student("Akash",111,"MBBS");
        Assert.assertFalse(student1.equals(student2));
    }

    @After
    public void tearDown() throws Exception {
        student1=null;
        student2=null;
    }
}