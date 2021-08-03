package org.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

    private LinkedList<Integer> linkedList;

    @Before
    public void init(){
        linkedList = new LinkedList<>();

        linkedList.addTail(1);
        //list : 1
        linkedList.addTail(2);
        // list : 1 -> 2
        linkedList.addTail(3);
        // list: 1 -> 2 -> 3
    }

    @Test
    public void add_tail_test() {
        Assert.assertEquals(Integer.valueOf(1), linkedList.getByIndex(1));
        Assert.assertEquals(Integer.valueOf(2), linkedList.getByIndex(2));
        Assert.assertEquals(Integer.valueOf(3), linkedList.getByIndex(3));
    }

    @Test
    public void add_start_test() {
        // list : 1 -> 2 -> 3
        linkedList.addStart(0);
        // list: 0 -> 1 -> 2 -> 3
        Assert.assertEquals( Integer.valueOf(0), linkedList.getByIndex(1));
        // list: 0->1->2->3
        Assert.assertEquals( Integer.valueOf(3), linkedList.getByIndex(4));

        Assert.assertEquals(Integer.valueOf(2), linkedList.getByIndex(3));
    }

    @Test
    public void add_middle_test(){
        //list : 1 -> 2 -> 3
        linkedList.addMiddle(5, 3);
        //list: 1 -> 2 -> 5 -> 3
        Assert.assertEquals(Integer.valueOf(5), linkedList.getByIndex(3));
        Assert.assertEquals(Integer.valueOf(3), linkedList.getByIndex(4));
    }

    @Test
    public void get_by_index_positive_test(){
        Assert.assertEquals(Integer.valueOf(1), linkedList.getByIndex(1));
        Assert.assertEquals(Integer.valueOf(2), linkedList.getByIndex(2));
        Assert.assertEquals(Integer.valueOf(3), linkedList.getByIndex(3));
    }

    @Test (expected = RuntimeException.class )
    public void get_by_index_negative_test(){
       linkedList.getByIndex(7);
    }

    @Test (expected = NullPointerException.class )
    public void get_negative_test(){
        linkedList=null;
        linkedList.getByIndex(7);
    }
}
