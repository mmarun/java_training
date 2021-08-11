package org.example;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ExecutorService executorService= Executors.newFixedThreadPool(2);

        for(int i= 10;i>5;i--)
        {
            executorService.submit(new MyRunnableThread(i),"shreesh");
        }
        executorService.shutdown();

        ExecutorService executorService1=Executors.newSingleThreadExecutor();
        Thread factThread=new Thread(new MyRunnableThread(5));
        factThread.start();
        factThread.yield();
        executorService1.shutdown();

    }
}
