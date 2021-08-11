package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main(String[] args ) throws Exception {

        //Creating Single thread executor
        ExecutorService Ex = Executors.newSingleThreadExecutor();

        for (int i=0;i<=4;i++)
        {
            Ex.execute(new MyRunnable());
        }
        Ex.shutdown();

        //Creating Fixed thread executor
        ExecutorService Ex2 = Executors.newFixedThreadPool(4);

        for (int i=0;i<=10;i++)
        {
            Ex2.execute(new MyRunnable());
        }
        Ex2.shutdown();

        //Creating Three thread using runnable interface

        Thread t1 = new Thread(new MyRunnable(),"FirstThread");
        Thread t2 = new Thread(new MyRunnable(),"SecondThread");
        Thread t3 = new Thread(new MyRunnable(),"ThirdThread");

        t1.start();
        t2.start();
        t3.start();

        t1.yield();
        t2.join(1000);


    }
}
