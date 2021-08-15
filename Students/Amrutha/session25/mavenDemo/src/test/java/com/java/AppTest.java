package com.java;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testPredicate()
    {
        Predicate<Integer> status=(a)->
        {
            if(a%5==0)
                return true;
            else
                return false;
        };
        Assert.assertTrue(status.test(5));
        Assert.assertFalse(status.test(13));

    }
    @Test
    public void testBifunction()
    {
        BiFunction<Double,Double,Double> mul=(Double a, Double b)->
        {
            return a*b;
        };

        Assert.assertEquals(Double.valueOf(3.75),mul.apply(1.5,2.5));


    }
}
