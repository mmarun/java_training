package org.javaTutorials;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Predicate;

@Getter
@Setter
@AllArgsConstructor
public class FunctionalInterfaceTest {


    @Test
    public void biFunctionTest() {
        BiFunction<Double, Double, Double> bifunction=(a,b)->{
            return a * b;
        };

        Double result= (Double) bifunction.apply(3.2,7.1);
        Assert.assertEquals(new Double(22.72),result);

    }


    @Test
    public void predicateTest(){
        Predicate<Integer> isDivisible=(k)-> {return k % 5==0;};
        Boolean result= isDivisible.test(30);
        Assert.assertEquals("True",result);
    }
}
