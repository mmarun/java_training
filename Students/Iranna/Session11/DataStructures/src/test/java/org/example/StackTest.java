package org.example;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest<T> {
    Stack<Integer> stackTest;

    @Before
    public void setUp() {
        stackTest = new Stack<>(5);
        stackTest.push(7);
        stackTest.push(2);
        stackTest.push(5);
    }

    @Test
    public void pushTest() {
        Assert.assertEquals(Integer.valueOf(5), stackTest.peek());
    }

    @Test(expected = NullPointerException.class)
    public void negativepushTest()
    {
        stackTest=null;
        stackTest.push(1);

    }

    @Test
    public void popTest()
    {
        Assert.assertEquals(Integer.valueOf(5),stackTest.peek() );
        stackTest.pop();
        Assert.assertEquals(Integer.valueOf(2),stackTest.peek() );

    }

    @Test(expected=NullPointerException.class)
    public void negativepopTest()
    {
        stackTest=null;
        stackTest.pop();
    }

}