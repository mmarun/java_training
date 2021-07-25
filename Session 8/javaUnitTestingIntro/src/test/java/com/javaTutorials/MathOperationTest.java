package com.javaTutorials;

import com.javaTutorials.MathOperation;
import org.junit.*;

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
    public void add_positive_tests() {
        int result = mathOperation.add(5, 8);
        Assert.assertEquals(13, result);
    }

    @Test
    public void subtract_positive_tests() {
        int result = mathOperation.subtract(15, 8);
        Assert.assertEquals(7, result);
    }

    @Test
    public void multiply() {
    }

    @Test
    public void divide() {
    }
}