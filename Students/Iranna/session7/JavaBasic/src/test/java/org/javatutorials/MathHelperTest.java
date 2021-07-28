package org.javatutorials;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathHelperTest {

    private MathHelper mathHelper;


    @Before
    public void setUp() {
        mathHelper = new MathHelper();
    }

    @After
    public void tearDown()  {
        mathHelper = null;
    }


    @Test
    public void remainder_tests() {
        int result = mathHelper.remainder(14, 3);
        Assert.assertEquals(2, result);
    }
}