package org.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MathHelper helper = new MathHelper();
        MathOperation mathOperation=new MathOperation();

        System.out.println("Addition of two numbers:"+mathOperation.addOperation(5,6));
        System.out.println("Subtraction of two numbers:"+mathOperation.subtractOperation(30,5));
        System.out.println("Remainder of a number:"+ helper.remainder(12,5));

    }
}
