package org.example;

import com.sun.org.apache.xml.internal.utils.ThreadControllerWrapper;
import extendThread.Minus;
import extendThread.Multiply;
import extendThread.Sum;
import implimentThread.Divide;
import implimentThread.Modulus;
import implimentThread.Percent;

public class App 
{
    public static void main( String[] args )
    {
        Thread sumThread =new Sum(12,45);
        sumThread.start();
        Thread minusThread=new Minus(65,43);
        minusThread.start();
        Thread multiThread=new Multiply(42,32);
        multiThread.start();
        System.out.println(multiThread.isDaemon());
        Thread divideThread=new Thread(new Divide(117,13));
        divideThread.setDaemon(true);
        divideThread.start();
        System.out.println(divideThread.isDaemon());
        Thread modulusThread=new Thread(new Modulus(86,16));
        modulusThread.start();
        Thread percentThread=new Thread(new Percent(60,100));
        percentThread.start();

    }
}
