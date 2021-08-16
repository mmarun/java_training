package org.javaTutorials;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    Stack stack=new Stack(5);
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void push_Test() {
    int size=stack.stack_size;
        Assert.assertEquals(5,size);

    }

    @Test
    public void pop_Test() {
        int size= stack.top;
        Assert.assertEquals(-1,size);
    }
}