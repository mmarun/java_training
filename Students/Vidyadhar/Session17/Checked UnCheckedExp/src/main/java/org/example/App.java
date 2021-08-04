package org.example;

import java.io.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static <bufferedReader> void main(String[] args ) {

        int array[] = new int[5];
        Integer a = 15;
        Integer b = 0;

        //ArithmeticException
        try {

            int data = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        //NUllPointer Exception
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        //Numberformate Exception

        try {
            String str = "Anand";
            int i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        //ArrayIndexOutofBoundException

        try {
            array[6] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        //StringIndexOutofBoundException
        try {
            String name = "Anamika HR";
            char lastName = name.charAt(12);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        //CheckedExceptions

        //FileNotFoundException
        try {
            FileReader file = new FileReader("ABC.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        //ClassNotfoundexception

        try {
            Class temp = Class.forName("ABC.txt");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

    }
}
