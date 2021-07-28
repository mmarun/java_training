package org.javaTutorials;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {

    Queue queue=new Queue(5);
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void addQueue_test() {
        int size=queue.capacity;
        Assert.assertEquals(5,size);
    }


    @Test
    public void removeQueue_test() {
        int size=queue.tail;
        Assert.assertEquals(-1,size);
    }
}
