package org.javaTutorials;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {

    //Queue<String> queue=new Queue<String>(5);
    private Queue<String> queue;

    @Before
    public void setUp() {
        queue= new Queue<>(5);

        queue.add_Queue("Sanju");
        queue.add_Queue("Rose");
        queue.add_Queue("Varun");
        queue.add_Queue("Amit");
        queue.add_Queue("Remya");
    }

    @Test
    public void addQueue_test() {
        Assert.assertEquals("Sanju",queue.arr_elements[0]);
        Assert.assertEquals("Rose",queue.arr_elements[1]);
        Assert.assertEquals("Varun",queue.arr_elements[2]);
        Assert.assertEquals("Amit",queue.arr_elements[3]);
        Assert.assertEquals("Remya",queue.arr_elements[4]);
    }


    @Test
    public void removeQueue_test() {
    queue.remove_Queue();
        Assert.assertEquals("Rose",queue.arr_elements[1]);
        Assert.assertEquals("Varun",queue.arr_elements[2]);
        Assert.assertEquals("Amit",queue.arr_elements[3]);
        Assert.assertEquals("Remya",queue.arr_elements[4]);

    }


}
