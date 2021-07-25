package org.example;


public class App 
{
    public static void main( String[] args )
    {
        MathOpretion M1=new MathOpretion();
        MathHelper M2=new MathHelper();

        System.out.println("the addition of two number"+M1.add(25,20));

        System.out.println("the addition of two number"+M1.substract(25,20));

        System.out.println("multiplication of two number" +M1.multiply(15,15));

        System.out.println("division of two number" +M1.divide(25,5));

        System.out.println("the reminder of two number" +M2.reminder(25,7));
    }
}
