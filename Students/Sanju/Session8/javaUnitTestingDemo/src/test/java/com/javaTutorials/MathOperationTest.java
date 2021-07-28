package com.javaTutorials;

import org.junit.*;
import com.javaTutorials.MathOperation;

public class MathOperationTest {

        MathOperation mathOperation;

    @Before
    public void setUp() {
        System.out.println("Before Test");
        mathOperation = new MathOperation();
    }
    @After
    public void tearDown(){
        System.out.println("After Test");
        mathOperation=null;

    }
    @Test
    public void add_Test(){
        System.out.println("Addition Testing");
        int add_result= mathOperation.add(7,5);
        Assert.assertEquals(12,add_result);
    }

    @Test
    public void subtract_Test(){
        System.out.println("Subtraction Testing");
        int sub_result=mathOperation.subtract(7,5);
        Assert.assertEquals(2,sub_result);
    }

    @Test
    public void multiply_Test(){
        System.out.println("Multiplication Testing");
        Assert.assertEquals(35,mathOperation.multiply(7,5));
    }

    @Test
    public void divide_Test(){
        System.out.println("Division Testing");
        Assert.assertEquals(1,mathOperation.divide(7,5));
    }
}
