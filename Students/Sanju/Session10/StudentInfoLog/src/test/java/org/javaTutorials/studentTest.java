package org.javaTutorials;

import org.javaTutorials.Student;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class studentTest {

   private Student student;

    @Before
    public void setUp(){
        student=new Student(1,"Amrutha","Bangalore");
    }
    @Test
    public void check_if_same_insatnce_return_true()
    {
        Student student2= student;
        Assert.assertTrue(student.equals(student2));
    }
    @Test
    public void studentTestPositive(){

            Student student2=new Student(1,"Amrutha","Bangalore");
            Assert.assertTrue(student.equals(student2));
    }

    @Test
    public void studentTestNegative() {
        Student student2=new Student(2,"Sanju","Bangalore");
        Assert.assertFalse(student.equals(student2));
    }
    @After
    public void tearDown(){

        student=null;
    }


}
