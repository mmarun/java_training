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
        M1 = new MathOpretion();

    }


    @Test
    public void add() {
        int result = M1.add(10,20);
        Assert.assertEquals(30,result);
    }

    @Test
    public void substract() {
        int result = M1.substract(40,10);
        Assert.assertEquals(30,result);
    }

    @Test
    public void multiply() {

        int result = M1.multiply(10,10);
        Assert.assertEquals(100,result);
    }

    @Test
    public void divide() {

        int result = M1.divide(50,5);
        Assert.assertEquals(10,result);

    }

    @After
    public void tearDown() throws Exception {
        M1 = null;
    }
}