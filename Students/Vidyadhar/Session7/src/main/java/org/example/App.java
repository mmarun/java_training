package org.example;


public class App 
{
    public static void main( String[] args )
    {
        MathOperation mathOperation=new MathOperation();
        MathHelper mathHelper=new MathHelper();

        System.out.println("the addition of two number"+mathOperation.add(25,20));

        System.out.println("the addition of two number"+mathOperation.substract(25,20));

        System.out.println("multiplication of two number" +mathOperation.multiply(15,15));

        System.out.println("division of two number" +mathOperation.divide(25,5));

        System.out.println("the reminder of two number" +mathHelper.reminder(25,7));
    }
}
