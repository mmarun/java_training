package org.javaTutorials;


import java.util.Locale;
import java.util.function.*;

/**
 * Introduction to Functional Interfaces like Predicate, Function, Consumer, Supplier
 *
 */

public class App
{
    static String Str="Sanju Rose Mathew";
    public static void main( String[] args ) {


        // Predicate
        Predicate<Integer> isEven=(i)->{
            return i % 2==0;
        };

        Predicate<Integer> isLessThan=(j)->{
            return j<10;
        };

        Predicate<Integer> isDivisible=(k)-> {return k % 5==0;};
        System.out.println(String.format("%s  -- Is Divisible by 5---  %s",30,isDivisible.test(30)));
        System.out.println(String.format("%s  -- Is Divisible by 5---  %s",102,isDivisible.test(102)));


        System.out.println(String.format("%s  - Is Even - %s", 12,isEven.test(12)));
        System.out.println(String.format("%s  - Is Even - %s", 17,isEven.test(17)));
        System.out.println(String.format("%s  - Is Even and less than 10- %s", 6,isEven.and(isLessThan).test(6)));
        System.out.println(String.format("%s  - Is Even or less than 10- %s", 5,isEven.or(isLessThan).test(5)));
        System.out.println(String.format("%s  - Is Even and less than 10- %s", 5,isEven.and(isLessThan).test(5)));


        // Function
        Function<Integer, String> function=(i) ->i.toString();
        System.out.println(function.apply(23));


        BiFunction<Integer, Integer, Integer> function1=(a, b)-> a + b ;
        System.out.println(function1.apply(4,5));

        BiFunction<Double, Double, Double> multiplyresult=(x,y) -> x*y;
        System.out.println(multiplyresult.apply(3.2,7.1));

        // Consumer
        Consumer<String> consumer=t-> {
            String str=t.toUpperCase(Locale.ROOT);
            char[] spell=str.toCharArray();
            for(int i=0;i<t.length();i++){
                System.out.println(spell[i]);
            }

        };
        consumer.accept("sanju");

        BiConsumer<String, String > strconcat=(t,u)->{
            System.out.println(t.concat(u));
        };

        strconcat.accept("Sanju", "Mathew");

        //Supplier

         Supplier<Integer> supplier1= () -> Str.length();
         Supplier<String> supplier2=() -> Str.toUpperCase();

         System.out.println(supplier1.get());
        System.out.println(supplier2.get());
    }
}
