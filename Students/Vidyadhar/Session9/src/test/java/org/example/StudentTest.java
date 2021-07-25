package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

    private Student student;

    @Before
    public void init()
    {
        student=new Student(101,"Darshan","Bangalore");
    }

    @Test
    public void check_if_same_insatnce_return_true()
    {
        Student otherstudent = student;
        Assert.assertTrue(student.equals(otherstudent));
    }

    @Test
    public void check_if_Diff_type_return_false()
    {
        double db1=49.56;
        Assert.assertFalse(student.equals(db1));
    }

    @Test
    public void positive_test()
    {
        Student otherstudent = new Student(101,"Darshan","Bangalore");
        Assert.assertTrue(student.equals(otherstudent));
    }

    @Test
    public void negetive_test()
    {
        Student otherstudent = new Student(102,"Varun","Mumbai");
        Assert.assertFalse(student.equals(otherstudent));
    }

}
