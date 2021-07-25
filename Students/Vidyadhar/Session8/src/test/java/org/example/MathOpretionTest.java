package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathOpretionTest {

    private MathOpretion M1;

    @Before
    public void setUp() throws Exception {

         M1= new MathOpretion();

    }


    @Test
    public void add() {

        System.out.println("Addition test Completed");
        int res=M1.add(10,20);
        Assert.assertEquals(res,30);
    }

    @Test
    public void sub() {

        System.out.println("Substract test Completed");
        int res=M1.sub(30,20);
        Assert.assertEquals(res,10);
    }

    @Test
    public void mul() {

        System.out.println("Multiplication test Completed");
        int res=M1.mul(10,5);
        Assert.assertEquals(res,50);
    }

    @Test
    public void div() {

        System.out.println("Division test Completed");
        int res=M1.div(10,5);
        Assert.assertEquals(res,2);
    }

    @Test
    public void remainder() {

        System.out.println("Remainder test Completed");
        int res=M1.remainder(50,5);
        Assert.assertEquals(res,0);
    }

    @After
    public void tearDown() throws Exception {

        M1=null;
    }
}