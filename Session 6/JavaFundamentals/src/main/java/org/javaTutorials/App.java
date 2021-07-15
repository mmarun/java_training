package org.javaTutorials;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //a - z
        //A - Z
        //Numbers  - you can use numbers but indentifier should not have first character as a number
        //_ and $
        //The identifiers are case sensitive..
        int $counter = 4;
        //Negative or positive and does not have a decimal point
        //byte, short, int, long
        //byte has 8 bits  ( 1 byte)
        //
        for(int k = 0; k < $counter; k++ ){
            System.out.println(k);
        }

        // Data sizes
        System.out.println("Byte min  " +  Byte.MIN_VALUE);
        System.out.println("Byte max  " + Byte.MAX_VALUE) ;
    }
}
