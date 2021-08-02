package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    private Queue queue = new Queue();
    @Before
    public void setUp() throws Exception {
        queue.insert(111);
        queue.insert(222);
        queue.insert(333);

    }

    @Test
    public void positiveTest_for_size()
    {
        Assert.assertEquals(5,queue.len);
        Assert.assertTrue("queue size is: "+queue.len,queue.len==5);
    }

    @Test
    public void negativeTest_for_size()
    {
        Assert.assertNotEquals(3,queue.len);
        Assert.assertFalse(queue.len!=5);
    }

    @Test
    public void insert_rearEnd_positiveTest() {
        queue.insert(444);
        Assert.assertEquals(444,queue.peekLast());
        Assert.assertTrue(queue.peekLast()==444);
    }

    @Test
    public void insert_rearEnd_negativeTest() {
        queue.insert(333);
        Assert.assertNotEquals(444,queue.peekLast());
        Assert.assertFalse(queue.peekLast()!=333);
    }

    @Test
    public void remove_frontEnd_positiveTest() {
        Assert.assertEquals(111,queue.remove());
        Assert.assertEquals(222,queue.remove());
    }

    @Test
    public void remove_frontEnd_negativeTest() {
        Assert.assertNotEquals(222,queue.remove());
        Assert.assertFalse(queue.remove()!=222);
    }

    @Test
    public void peek_positiveTest() {
        Assert.assertEquals(111,queue.peek());
        Assert.assertTrue(queue.peek()==111);
    }

    @Test
    public void peek_negativeTest() {
        Assert.assertNotEquals(333,queue.peek());
        Assert.assertFalse(queue.peek()!=111);
    }

    @After
    public void tearDown() throws Exception {
        queue=null;
    }

}