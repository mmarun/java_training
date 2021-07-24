package org.example;


public class App 
{
    public static void main( String[] args )
    {
        MathOpretion M1=new MathOpretion();

        System.out.println("Addition of a&b is: "+M1.add(25,20));
        System.out.println("Substraction of a&b is: "+M1.sub(25,5));
        System.out.println("Multiplication of a&b is: "+M1.mul(15,15));
        System.out.println("Division of a&b is: "+M1.div(25,5));
        System.out.println("Remainder of a&b is: "+M1.remainder(20,4));

    }
}
