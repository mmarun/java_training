package org.example;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueTest<T> {
    Queue<Integer> queueTest;

    @Before
    public void setUp() {
        queueTest = new Queue<>(5);
        queueTest.enqueue(5);
        queueTest.enqueue(6);
        queueTest.enqueue(7);
    }
    @Test
    public void enqueueTest()
    {
        Assert.assertEquals(Integer.valueOf(5), queueTest.get() );

    }
    @Test(expected = NullPointerException.class)
    public void negativeAddTest()
    {
        queueTest =null;
        queueTest.enqueue(1);

    }
    @Test
    public void dequeueTest()
    {
        Assert.assertEquals(Integer.valueOf(1), queueTest.get() );
        queueTest.dequeue();
        Assert.assertEquals(Integer.valueOf(2), queueTest.get() );

    }

    @Test(expected=NullPointerException.class)
    public void negativeDeleteTest()
    {
        queueTest =null;
        queueTest.dequeue();
    }


}
