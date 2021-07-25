package org.demo;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathHelperTest extends TestCase {

    MathHelper mathHelperTest;
    @Before
    public void setUp() throws Exception {
        System.out.println("Before Method");
        mathHelperTest=new MathHelper();
    }
    @Test
    public void testRemainder() {
        System.out.println("test remainder Method");
        Assert.assertEquals(0,mathHelperTest.remainder(6,2));
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("tear down method");
        mathHelperTest=null;
    }
}