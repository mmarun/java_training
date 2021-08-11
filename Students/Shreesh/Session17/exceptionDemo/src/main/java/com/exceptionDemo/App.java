package com.exceptionDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("............First Example For Exception............");
        Integer num=0;
        Integer num1=0;

        try {
            num1=null;
            num=5;
            num=num + num1;
            System.out.println(num);
        }
        catch (NullPointerException exception)
        {
            System.out.println("Throws "+exception.getMessage()+" " +exception.getCause());
            //recovery Logic
            num1=0;
        }
        finally {
            System.out.println("From Finally Block OutPut: "+ (num=num+num1));
        }
        System.out.println("............Second Example For Exception............");

        Integer num2=0;
        Integer num3=0;
        try{
            num2=30;
            num3=0;
            int output=num2/num3;
            System.out.println ("Result: "+output);
        }
        catch(ArithmeticException exception){
            System.out.println ("You Shouldn't divide a number by zero");
            //exception.printStackTrace();
            //recovery Logic
            num3=1;
        }
        finally {
            System.out.println("From Finally Block OutPut: "+ (num2/num3));
        }
        System.out.println("............Third Example For Exception............");

        String str[] = { "Apple", "Banana" };
        List<String> list = null;
        List<String> list1=null;
        try
        {
            list = Arrays.asList(str);
            list.add("Mango");
        }
        catch (UnsupportedOperationException e)
        {
            System.out.println("Cannot add value into String Array ");
            //recovery Logic
            list1 = new ArrayList<>(list);
        }
        finally {
            System.out.println("From Finally Block OutPut: ");
            list1.add("Mango");
            for(String s:list1)
            {
                System.out.println(s);
            }
        }

        System.out.println("............Fourth Example For Exception............");
        Object object=null;
        Integer integer=null;
        try
        {
            object=new String("6");
            integer=(Integer)object;
        }
        catch (ClassCastException exception)
        {
            System.out.println("Can not Cast String Type Object into Integer type Object");
            object=new Integer(6);
            integer=(Integer) object;
        }
        finally {
            System.out.println("From Finally Block OutPut: " + integer);
        }

        System.out.println("............Fifth Example For Exception............");
        Object [] objects=null;

        try
        {
            objects=new Double[2];
            objects[0]=new Integer(5);
        }
        catch (ArrayStoreException exception)
        {
            System.out.println("Cannot Store Interger Value in Double Array");
            //Recovery Logic
            objects[0]=new Double(5);
        }
        finally {
            for(Object o :objects)
            {
                System.out.println(o);
            }
        }
        System.out.println("............Checked Exception............");

        FileReader fr=null;
        try {
            fr = new FileReader("d:\\my.txt");
        }
        catch (FileNotFoundException fe) {
            System.out.println("File Not found on given path............");
            //recovery logic
            File file=new File("d:\\my.txt");
        }
        finally {

        }
    }

}
