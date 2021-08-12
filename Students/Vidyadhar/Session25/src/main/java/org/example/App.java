package org.example;


import org.example.FunctionalInterface.DisplayMsg;
import org.example.FunctionalInterface.Predicateimpl;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

        //Anonymous Function Implementation using lamda expression
         DisplayMsg message =()-> System.out.println("Anonymous Class Implementation with using lamda expression");
        message.msg();

        //Anonymous Class Implementation without using lamda expression
        DisplayMsg displayMsg = new DisplayMsg() {
            @Override
            public void msg() {
                System.out.println("This is Anonymous Class Implementation without using lamda expression");
            }
        };
        displayMsg.msg();

        //Implementing Predicate
        Predicate<Integer> predicate =  Predicateimpl::checkAge;

        boolean result = predicate.test(25);
        System.out.println("static method of class calling by using Predicate interface Reference "+result);

       boolean res = Predicateimpl .checkAge(34);
        System.out.println("static method of class calling by using classname "+res);

//
//        Predicateimpl pre = new Predicateimpl();
//        boolean res1 = pre.divisible(215);
//        System.out.println(res1);

        Predicate<Integer> predicate1 = Predicateimpl::divisible;
        boolean res2 = predicate1.test(135);
        System.out.println(res2);


        //implementing  Consumer interface
        Consumer<Integer> consumer1 = ConsumerImp::getSquare;
        consumer1.accept(25);

        Consumer<String> consumer2 = ConsumerImp::printMsg;
        consumer2.accept("Vidyadhar");

        //Implementing DoubleSupplier using lamda expression
        DoubleSupplier supplier1 = () -> SupplierImp.add(123.99,384.88);
        System.out.println(supplier1.getAsDouble());

        DoubleSupplier supplier2 = () -> SupplierImp.sub(43.42,12.33);
        System.out.println(supplier2.getAsDouble());

        //Multiplication of two double number using BiFunction implementation
        BiFunction<Double,Double,Double> multiply = new BiFunctionImp() {
            @Override
            public Double apply(Double aDouble, Double aDouble2) {
                return aDouble*aDouble2;
            }
        };

        System.out.println(multiply.apply(23.4,11.33));


        //Multiplication of two double number using lamda Expression
        BiFunction<Double,Double,Double> multiply1 = (k,v)->k*v;
        System.out.println(multiply1.apply(2.4,1.2));
    }
}
