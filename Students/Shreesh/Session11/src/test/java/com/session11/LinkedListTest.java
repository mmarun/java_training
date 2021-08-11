package com.session11;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    private LinkedList linkedList;

    @Before
    public void init()
    {
        linkedList=new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
    }

    @Test
    public void insertTest() {
        linkedList.insert(5);
        Assert.assertEquals(5,linkedList.valueAt(4));
    }

    @Test
    public void insertAtStartTest() {
       linkedList.insertAtStart(7);
       Assert.assertEquals(7, linkedList.valueAt(0));
    }

    @Test
    public void insertAtTest() {
        linkedList.insertAt(3,6);
        Assert.assertEquals(6,linkedList.valueAt(3));
    }

    @Test
    public void deleteAtTest() {
        int countBefore= linkedList.countList();
        linkedList.deleteAt(3);
        int countAfter= linkedList.countList();
        Assert.assertTrue(countAfter!=countBefore);
    }
}