package com.session11;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    private Queue queue=new Queue();

    @Before
    public void init()
    {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
    }

    @Test
    public void enQueueTest() {
        queue.enQueue(4);
        Assert.assertTrue(4==queue.valueAt(4));
    }

    @Test
    public void deQueueTest() {
        int beforeSize= queue.sizeOf();
        queue.deQueue();
        int afterSize=queue.sizeOf();
        Assert.assertTrue(beforeSize==afterSize+1);

    }
}