package org.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MathOperation mathOperation=new MathOperation();
        MathHelper mathHelper=new MathHelper();

        System.out.println("Addition of two numbers:"+mathOperation.addOperation(5,6));
        System.out.println("Subtraction of two numbers:"+mathOperation.subtractOperation(30,5));
        System.out.println("Multiply of two numbers:"+mathOperation.multiplyOperation(30,5));
        System.out.println("Division of two numbers:"+mathOperation.divideOperation(30,5));
        System.out.println("Remainder of a number:"+mathHelper.remainder(12,5));

    }
}
