package org.example;

import org.example.Threading.MyResource;

import java.util.concurrent.Executor;
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
        ExecutorService ExService = Executors.newSingleThreadExecutor();

        for (int i=0;i<=4;i++)
        {
            ExService.execute(new MyResource());
        }
        ExService.shutdown();

        //Creating Fixed thread executor
        ExecutorService ExService2 = Executors.newFixedThreadPool(4);

        for (int i=0;i<=10;i++)
        {
            ExService2.execute(new MyResource());
        }
        ExService2.shutdown();

        //Creating Three thread using runnable interface

        Thread thread1 = new Thread(new MyResource(),"FirstThread");
        Thread thread2 = new Thread(new MyResource(),"SecondThread");
        Thread thread3 = new Thread(new MyResource(),"ThirdThread");

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.yield();
        thread3.join(3000);


    }
}
