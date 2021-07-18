package com.javaTutorials;

/**
 * Hello world!
 *
 */

public class App {
    public static void main( String[] args )
    {
        MathOperation mathOperation=new MathOperation();
        MathHelper mathHelper=new MathHelper();

        System.out.println("Addition of two numbers:"+mathOperation.add(15,8));
        System.out.println("Subtraction of two numbers:"+mathOperation.subtract(18,15));

        System.out.println("Multiplication:"+mathOperation.multiply(12,6));
        System.out.println("division of two numbers:"+mathOperation.divide(16,4));

        System.out.println("Remainder of a number:"+mathHelper.remainder(58,5));

    }
}
