package com.javaTutorials;

/**
 * Hello world!
 *
 */

public class App {
    public static void main( String[] args )
    {
        AppHelper appHelper = new AppHelper();


        //int, double, short, long, float, char, byte, boolean
        //Integer, Double, Short, Long, Float, Character, Byte, Boolean

        //C++, C - Primitive types
        int num = 88;

        //Primitive to object type is called boxing
        Integer number = Integer.valueOf(num); //we have boxed the value of an int to an integer..
                                                // Boxed an primitive into object type.

        Double doubleNumber = Double.valueOf("2.3");
        doubleNumber = Double.valueOf(2.3);
        System.out.println(doubleNumber);

        //Unboxing converting Object type to primitive type it is called unboxing
        int k = number.intValue(); //Primitive type == objectType.xxxValue();
        System.out.println(k);

        Long objectLong = new Long(23L);
        long l = objectLong;



        Character charac = 'k';

        for (int i = 0; i < 5; i++) {
            int randomInteger = Double.valueOf(Math.random() * 100).intValue();
            Parent parent;
            if (randomInteger % 2 == 0) {
                parent = new EvenChild();
            } else {
                parent = new OddChild();
            }
            appHelper.showInfo(parent, randomInteger);
        }

        /*
        MathOperation mathOperation=new MathOperation();
        MathHelper mathHelper=new MathHelper();

        System.out.println("Addition of two numbers:"+mathOperation.add(15,8));
        System.out.println("Subtraction of two numbers:"+mathOperation.subtract(18,15));

        System.out.println("Multiplication:"+mathOperation.multiply(12,6));
        System.out.println("division of two numbers:"+mathOperation.divide(16,4));

        System.out.println("Remainder of a number:"+mathHelper.remainder(58,5));
         */

    }




}
