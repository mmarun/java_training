package org.demo;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathOperationTest extends TestCase {

    MathOperation mathOperationTest;
    @Before
    public void setUp() throws Exception {
        System.out.println("Before Method");
        mathOperationTest=new MathOperation();
    }

    @Test
    public void testAddOperation() {
        System.out.println("test add Method");
        Assert.assertEquals(9,mathOperationTest.addOperation(4,5));
    }
    @Test
    public void testSubtractOperation() {
        System.out.println("test subtract Method");
        Assert.assertEquals(5,mathOperationTest.subtractOperation(10,5));
    }
    @Test
    public void testMultiplyOperation() {
        System.out.println("test multiply Method");
        Assert.assertEquals(5,mathOperationTest.multiplyOperation(1,5));
    }
    @Test
    public void testDivideOperation() {
        System.out.println("test divide Method");
        Assert.assertEquals(5,mathOperationTest.divideOperation(15,3));
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("tear down method");
        mathOperationTest=null;
    }
}