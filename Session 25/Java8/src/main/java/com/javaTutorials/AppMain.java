package com.javaTutorials;

import com.javaTutorials.interfaces.BiFunctionImpl;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class AppMain  {

    public static void main(String[] args){
        Predicate<Integer> isEven = (k) -> {
                return k %2 == 0;
        };

        Predicate<Integer> isGreaterThan15 = (k) -> {
            return k > 15;
        };


        System.out.println(String.format("%s - Is Even -%s", 12, isEven.test(12)));
        System.out.println(String.format("%s - Is Even -%s", 19, isEven.test(19)));

        System.out.println(String.format("%d - Is even or greater than 15 -%s", 5, isEven.or(isGreaterThan15).test(5)));
        System.out.println(String.format("%d - Is even or greater than 15 -%s", 17, isEven.or(isGreaterThan15).test(17)));
        System.out.println(String.format("%d - Is even or greater than 15 -%s", 10, isEven.or(isGreaterThan15).test(10)));
        System.out.println(String.format("%d - Is even or greater than 15 -%s", 13, isEven.or(isGreaterThan15).test(13)));
        System.out.println(String.format("%d - Is even or greater than 15 -%s", 20, isEven.or(isGreaterThan15).test(20)));

        Function<Integer, String> function = k -> k.toString();
        System.out.println(function.apply(12));

        Function<Integer, Integer> convertFunction = k -> k + 10;
        System.out.println(convertFunction.apply(12));

        //Is nameless, anonymous, parameter types are inferred at compile..
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(32,23));
        //Lambda expression reduces the amount of code you write..
        //Anonymous functions also did that but lambda expression took it to another level..

        BiFunction<Integer, Integer, Integer> example = new BiFunctionImpl();
        System.out.println(example.apply(12, 13));

        //Is nameless, anonymous, parameter types are inferred at compile..
        BiFunction<Integer, Integer, Integer> example2 = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        //Anonymous class we will convert to lambda expression
        //Is nameless, anonymous, access specifier less, parameter types are inferred at compile..

        //Get rid of new keyword.
        //Get rid of the class name or rather class constructor
        // Get rid of parenthesis
        //Get rid of @Override,
        //Get rid of the function name
        //Get rid of return type of the function
        // Get rid of access modifier

        //get red of parameter

        //If I have only one statement I can get rid of the parenthesis and the return keyword..
        BiFunction<Integer, Integer, Integer> example3 =   (k, v) -> k + v;
        //Two arguments so I use (k, v)
        //Zero arguments I use () e.g. () -> sout("Hello")
        //One argument I can also get rid of round brackets  ()

        Predicate<Integer> isGreaterThan100 = k -> k > 100;
        System.out.println("Is 105 greater than 100 = " + isGreaterThan100.test(105));



        System.out.println(example3.apply(21,9));



    }
}
