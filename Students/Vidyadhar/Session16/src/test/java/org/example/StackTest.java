package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    private Stack stack = new Stack();
    @Before
    public void setUp() throws Exception {
        stack.push(100);
        stack.push(200);
        stack.push(300);

    }

    @Test
    public void Check_size_positiveTest(){
        Assert.assertEquals(5,stack.size);
    }

    @Test
    public void Check_size_negativeTest(){
        Assert.assertNotEquals(8,stack.size);
    }

    @Test
    public void push_positiveTest(){
        stack.push(111);
        Assert.assertEquals(111,stack.peek());
    }

    @Test
    public void push_negativeTest()
    {
        stack.push(333);
        Assert.assertNotEquals(111,stack.peek());
    }


    @Test
    public void pop_positiveTest() {
        Assert.assertEquals(300,stack.pop());
        Assert.assertEquals(200,stack.pop());
    }

    @Test
    public void pop_negativeTest() {
        Assert.assertNotEquals(200,stack.pop());

    }

    @Test
    public void stack_peek_positiveTest() {
        stack.push(500);
        Assert.assertEquals(500,stack.peek());
        Assert.assertTrue("Top of the stack is: "+stack.peek(),stack.peek()==500);
    }

    @Test
    public void stack_peek_negativeTest() {
        stack.push(500);
        Assert.assertNotEquals(600,stack.peek());
        Assert.assertFalse(stack.peek()!=500);
    }

    @After
    public void tearDown() throws Exception {
        stack=null;
    }
}