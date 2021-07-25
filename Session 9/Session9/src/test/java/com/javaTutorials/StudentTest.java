package com.javaTutorials;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

    private Student student;

    @Before
    public void init(){
        student = new Student(1, "Arun", "Bangalore");
    }

    @Test
    public void check_if_same_instance_return_true(){
        Student otherStudent = student;
        Assert.assertTrue(student.equals(otherStudent));
    }

    @Test
    public void check_if_different_type_return_false(){
        Double dbl = 21.2;
        Assert.assertFalse(student.equals(dbl));
    }

    @Test
    public void equals_positive_test(){
        Student otherStudent = new Student(1, "Arun", "Bangalore");
        Assert.assertTrue(student.equals(otherStudent));
    }

    @Test
    public void equals_negative_test() {
        Student otherStudent = new Student(2, "Ravi", "Chennai");
        Assert.assertFalse(student.equals(otherStudent));
    }
}
