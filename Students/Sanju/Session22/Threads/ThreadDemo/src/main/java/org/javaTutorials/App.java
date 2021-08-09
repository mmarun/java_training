package org.javaTutorials;

import org.javaTutorials.Threading.MyThread;
import org.javaTutorials.Threading.ThreadMethodsDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws Exception, InterruptedException{

        //Single Thread Executor
        ExecutorService executorService= Executors.newSingleThreadExecutor();

        for(int i=0;i<10;i++){
            executorService.submit(new MyThread(),"Sanju");
        }
        executorService.shutdown();

        // FixedThreadPool
        ExecutorService fixedExecutor=Executors.newFixedThreadPool(3);
        for(int i=0;i<10;i++){
            fixedExecutor.submit(new MyThread(),"Jovi");
        }

        fixedExecutor.shutdown();


        Thread thread1=new MyThread();
        Thread thread2=new ThreadMethodsDemo();

        thread1.start();
        thread2.start();

        // Since thread1 takes time asks it to yield and thread2 executes first
        thread1.yield();


    }
}
