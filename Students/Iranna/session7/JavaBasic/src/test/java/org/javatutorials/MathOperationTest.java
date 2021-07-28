package org.javatutorials;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathOperationTest {
    private MathOperation mathOperation;


    @Before
    public void setUp() {
        mathOperation = new MathOperation();
    }

    @After
    public void tearDown()  {
        mathOperation = null;
    }


    @Test
    public void add_tests() {
        int result = mathOperation.add(5, 8);
        Assert.assertEquals(13, result);
    }

    @Test
    public void subtract_tests() {
        int result = mathOperation.subtract(15, 8);
        Assert.assertEquals(7, result);
    }

    @Test
    public void multiply_tests() {
        int result = mathOperation.multiply(12,3);
        Assert.assertEquals(36,result);
    }

    @Test
    public void divide_tests() {
        int result = mathOperation.divide(16,4);
        Assert.assertEquals(4,result);
    }
}
