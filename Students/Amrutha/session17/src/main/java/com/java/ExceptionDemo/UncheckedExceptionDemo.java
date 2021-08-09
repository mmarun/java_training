package com.java.ExceptionDemo;

public class UncheckedExceptionDemo {

    public static void main( String[] args ) {

        //outer try block
        try{

            try{
                int b =39/0;
            }
            //catch block of inner try block 1
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }

            try{
                int a[]=new int[5];

                //assigning the value out of array bounds
                a[5]=4;
            }

            //catch block of inner try block 2
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }

            try{
                String s=null;
                System.out.println(s.length());
            }

            //catch block of inner try block 3
            catch(NullPointerException e)
            {
                System.out.println(e);
            }
            try{
                String s="abc";
                int i=Integer.parseInt(s);
            }

            //catch block of inner try block 3
            catch(NumberFormatException e)
            {
                System.out.println(e);
            }
            try{
                String s="abc";
                char c=s.charAt(3);

            }

            //catch block of inner try block 3
            catch(StringIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }

        }
        catch(Exception e)
        {

        }


    }



}
