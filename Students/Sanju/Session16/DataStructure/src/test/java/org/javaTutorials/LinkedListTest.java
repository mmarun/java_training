package org.javaTutorials;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

    private LinkedList linkedList;

    @Before
    public void init(){
        linkedList=new LinkedList<>();
        linkedList.insertList(1);
        linkedList.insertList(3);
        linkedList.insertList(5);


    }

    /**
     * 1->3->5
     * Inserting 6, list should be
     * 6->1->3->5
     */

    @Test
    public void insert_last_test(){
        linkedList.insertList(6);
       Assert.assertEquals(Integer.valueOf(1),linkedList.getByIndex(0));
       Assert.assertEquals(Integer.valueOf(3),linkedList.getByIndex(1));
       Assert.assertEquals(Integer.valueOf(5),linkedList.getByIndex(2));
       Assert.assertEquals(Integer.valueOf(6),linkedList.getByIndex(3));
    }

    /**
     * 1->3->5
     * 1->3->5->9
     */

    @Test
    public  void insert_first_test(){
        linkedList.insertFirst(9);
        Assert.assertEquals(Integer.valueOf(9),linkedList.getByIndex(0));
        Assert.assertEquals(Integer.valueOf(1),linkedList.getByIndex(1));
        Assert.assertEquals(Integer.valueOf(3),linkedList.getByIndex(2));
        Assert.assertEquals(Integer.valueOf(5),linkedList.getByIndex(3));

    }
    /**
     * 1->3->5
     * 1->3->5
     */

    @Test
    public  void insert_middle_test(){
        linkedList.insertMiddle(9);

        Assert.assertEquals(Integer.valueOf(1),linkedList.getByIndex(0));
        Assert.assertEquals(Integer.valueOf(3),linkedList.getByIndex(1));
        Assert.assertEquals(Integer.valueOf(9),linkedList.getByIndex(2));
        Assert.assertEquals(Integer.valueOf(5),linkedList.getByIndex(3));

    }
    @Test
    public void get_by_index_test(){
        Assert.assertEquals(Integer.valueOf(1),linkedList.getByIndex(0));
        Assert.assertEquals(Integer.valueOf(3),linkedList.getByIndex(1));
        Assert.assertEquals(Integer.valueOf(5),linkedList.getByIndex(2));

    }

}
