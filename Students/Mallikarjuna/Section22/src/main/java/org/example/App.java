package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {



        ExecutorService executorService= Executors.newFixedThreadPool(5);
        for(int i=1; i <= 5; ++i){
            executorService.submit(new MyThreadClass(), "FixedThread"+i);
        }
        executorService.shutdown();


        Thread myRunnable = new Thread(new MyRunnable(), "MyJoinThread");
        myRunnable.setPriority(2);
        myRunnable.start();
        myRunnable.yield();
        myRunnable.join();

    }
}