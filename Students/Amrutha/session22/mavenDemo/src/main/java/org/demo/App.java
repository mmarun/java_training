package org.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {


    //Fixed threadpool
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        for(int i=1; i <= 5; ++i){
            executorService.submit(new MyThreadClass(), "FixedThread"+i);
        }
        executorService.shutdown();
 /*
    //Cahed thread pool
        ExecutorService executorService1= Executors.newCachedThreadPool();
        for(int i=1; i <= 5; ++i){
            executorService1.submit(new MyThreadClass(), "CachedThread"+i);
        }
        executorService1.shutdown();

        //single thread pool
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        for (int i = 1; i <= 5; ++i) {
            executorService2.submit(new MyThreadClass(), "SingleThread" + i);
        }
        executorService2.shutdown();
*/

            Thread myRunnable = new Thread(new MyRunnable(), "MyJoinThread");
            myRunnable.setPriority(2);
            myRunnable.start();
            myRunnable.yield();
            myRunnable.join();

    }
}
