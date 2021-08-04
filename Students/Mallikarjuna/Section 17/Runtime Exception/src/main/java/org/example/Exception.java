package org.example;

/**
 * Hello world!
 *
 */
public class Exception {



    public static void main(String[] args )
    {
        String ptr = null;
        try {

            if (ptr.equals("gfg"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
       catch (java.lang.NullPointerException e) {

           System.out.println("Null pointer exception");
       }
        System.out.println("------------------------------------------------------------------------");
        try {
            int a = 30, b = 0;
            int c = a/b;
            System.out.println ("Result = " + c);
        }
        catch(ArithmeticException e)
        {

            System.out.println ("Can't divide a number by 0");
            System.out.println ("ArithmeticException");
        }
        System.out.println("------------------------------------------------------------------------");
        try {
            String a = "This is like chipping ";
            char c = a.charAt(24);
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
        System.out.println("------------------------------------------------------------------------");
        try
        {
            int num = Integer.parseInt ("arjun") ;

            System.out.println(num);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Number format exception");
        }
        System.out.println("------------------------------------------------------------------------");
        try
        {
            int a[] = new int[5];
            a[6] = 9;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println ("Array Index is Out Of Bounds");
        }
    }

}
