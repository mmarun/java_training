package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathOpretionTest {

    private MathOperation mathOperation;

    @Before
    public void setUp() throws Exception {
        mathOperation = new MathOperation();

    }


    @Test
    public void add() {
        int result = mathOperation.add(10,20);
        Assert.assertEquals(30,result);
    }

    @Test
    public void substract() {
        int result = mathOperation.substract(40,10);
        Assert.assertEquals(30,result);
    }

    @Test
    public void multiply() {

        int result = mathOperation.multiply(10,10);
        Assert.assertEquals(100,result);
    }

    @Test
    public void divide() {

        int result = mathOperation.divide(50,5);
        Assert.assertEquals(10,result);

    }

    @After
    public void tearDown() throws Exception {
        mathOperation = null;
    }
}