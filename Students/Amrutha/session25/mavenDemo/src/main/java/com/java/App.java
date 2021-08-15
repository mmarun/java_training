package com.java;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    static Logger log = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        //Function use with lamda expression
        Function<Integer,String> even=(integer) -> {

                if(integer%2==0)
                    return "even";
                else
                return "odd";

        };
        System.out.println(even.apply(10));

        //Bifunction use with Lamda expression

        BiFunction<Double,Double,Double> addition=(Double a,Double b)->
        {
            return a*b;
        };
        System.out.println("Multiplication:"+addition.apply(4.5,5.5));

        //Predicate Use

        Predicate<Integer> status=(a)->
        {
            if(a%5==0)
                return true;
            else
                return false;
        };
        System.out.println("Predicate divisble by 5:"+status.test(10));

    }
}
