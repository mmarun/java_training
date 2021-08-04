package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    private LinkedList ls;

    @Before
    public void setUp() throws Exception {
        ls = new LinkedList();
        ls.insert(10);
        ls.insert(20);
        ls.insert(30);
    }


    @Test
    public void positive_test_of_insert() {

        Assert.assertEquals(10,ls.showAt(1));
        Assert.assertEquals(30,ls.showAt(3));
    }

    @Test
    public void negative_test_of_insert()
    {
        Assert.assertNotEquals(10,ls.showAt(3));
        Assert.assertNotEquals(20,ls.showAt(1));
    }

    @Test
    public void insertAtStart() {
        ls.insertAtStart(500);
        Assert.assertEquals(500,ls.showAt(1));
    }

    @Test
    public void insertAt() {
        ls.insertAt(2,50);
        ls.insertAt(1,100);
        Assert.assertEquals(50,ls.showAt(4));
        Assert.assertEquals(100,ls.showAt(2));
    }

    @Test
    public void get_by_index(){
        Assert.assertEquals(10,ls.showAt(1));
    }

    @Test
    public void negative_get_by_index()
    {
        Assert.assertNotEquals(40,ls.showAt(2));
    }
    @After
    public void tearDown() throws Exception {
        ls = null;
    }

}