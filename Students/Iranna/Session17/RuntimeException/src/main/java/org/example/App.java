package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args){

            try {
                int a[] = new int[10];
                //Array has only 10 elements
                a[11] = 9;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Out Of Bounds");
            }
            System.out.println("after array index excetion");
            int num1 = 30, num2 = 0;


            try {
                int output = num1 / num2;
                System.out.println("Result: " + output);
            } catch (ArithmeticException e) {
                System.out.println("You Shouldn't divide a number by zero");
            }
            System.out.println("after arithmetic exception");

            try {
                String str = "banglore";
                System.out.println(str.length());
                ;
                char c = str.charAt(0);
                c = str.charAt(40);
                System.out.println(c);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("String Index Out Of Bounds Exception!!");
            }
            System.out.println("after string index exception");

            try {
                String str = null;
                System.out.println(str.length());
            } catch (NullPointerException e) {
                System.out.println("Null Pointer Exception occured..");
            }

            System.out.println("after null pointer exception");

            try {
                int num = Integer.parseInt("MUMBAI");
                System.out.println(num);
            } catch (NumberFormatException e) {
                System.out.println("Number format exception occurred");
            }
            System.out.println("after number format exception");
        }


}
