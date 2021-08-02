package org.javaTutorials;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest<T> extends Stack<T>{

    Stack<T> stack;

    @Before
    public void setUp() throws Exception {
        stack =new Stack<T>(5);
        stack.push(6);
        stack.push(3);
        stack.push(4);
        stack.push(7);
        stack.push(8);
    }

    @Test
    public void push_test() {
        Assert.assertEquals(6,stack.arr_elements[0]);
        Assert.assertEquals(3,stack.arr_elements[1]);
        Assert.assertEquals(4,stack.arr_elements[2]);
        Assert.assertEquals(7,stack.arr_elements[3]);
        Assert.assertEquals(8,stack.arr_elements[4]);

    }

    @Test
    public void pop_Test() {
        stack.pop();
        Assert.assertEquals(6,stack.arr_elements[0]);
        Assert.assertEquals(3,stack.arr_elements[1]);
        Assert.assertEquals(4,stack.arr_elements[2]);
        Assert.assertEquals(7,stack.arr_elements[3]);

    }
}