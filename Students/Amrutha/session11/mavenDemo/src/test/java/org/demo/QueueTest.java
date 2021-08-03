package org.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueTest<T> {
    Queue<Integer> queueTest;

    @Before
    public void setUp()  {
        queueTest =new Queue<>(5);
        queueTest.add(1);
        queueTest.add(2);
        queueTest.add(3);
    }

    @Test
    public void addTest()
    {
        Assert.assertEquals(Integer.valueOf(1), queueTest.get() );

    }
    @Test(expected = NullPointerException.class)
    public void negativeAddTest()
    {
        queueTest =null;
        queueTest.add(1);

    }
    @Test
    public void deleteTest()
    {
        Assert.assertEquals(Integer.valueOf(1), queueTest.get() );
        queueTest.delete();
        Assert.assertEquals(Integer.valueOf(2), queueTest.get() );

    }

    @Test(expected=NullPointerException.class)
    public void negativeDeleteTest()
    {
        queueTest =null;
        queueTest.delete();
    }
}
