package com.javaTutorials;

public class App
{
    public static void main( String[] args )
    {
/*

        ----------------------------------------------------------------------------------------------
        ----Exceptions-----------------------------------------------------------Errors--------------
        ---Can be recovered---------------------------------------------Cannot be recovered from-------
 */
        System.out.println(add(100));


    }

    public static int add(int i){
        if (i == 0)
            return 0;
        return i + add(i+1);
    }
}

