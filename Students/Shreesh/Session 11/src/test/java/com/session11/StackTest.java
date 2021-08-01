package com.session11;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    private Stack nums=new Stack();
    public int top;

    @Before
    public void init()
    {
        nums.push(1);
        nums.push(2);
        nums.push(3);
    }

    @Test
    public void pushTest() {
        nums.push(4);
        Assert.assertEquals(4,nums.valueAt(4));

    }

    @Test
    public void popTest() {
        int beforeSize= nums.size();
        nums.pop();
        int afterSize=nums.size();
        Assert.assertTrue(beforeSize!=afterSize);
    }

    @Test
    public void sizeTest() {
        int actualSize=0;
        for(int i=1;i<=5;i++)
        {
            if(nums.valueAt(i)>0)
            {
                actualSize++;
            }
        }
        Assert.assertTrue(actualSize== nums.size());
    }
}