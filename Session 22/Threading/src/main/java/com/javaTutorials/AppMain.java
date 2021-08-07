package com.javaTutorials;


import com.javaTutorials.threading.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AppMain {
    public static void main(String [] args)  throws Exception {

 /*       ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=0; i < 100; ++i){
            executorService.submit(new MyRunnable());
        }

        executorService.shutdown();
*/
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        thread.yield();
        thread.join();

        System.out.println("Introducing deadlock");
        Thread.currentThread().join(100000);
        System.out.println("Deadlock over..");
        System.out.println("completed execution");

    }


    //Thread life cycle --- Create A Thread -> Start a Thread(runnable)  -> Running -> Terminated..
    //Thread pause events --- Thread can wait.. running phase -> waiting state -> runnable phase.
                             // yeild .. - running phase -> runnable phase
                             // sleep ..   take rest for a fixed amount of time..
                             // wait ..     In thread synchronization you wait for other thread to finish.
                             // suspend ... This method was available..

    public static void sum() {
        int total = 0;
        for(int i = 1; i <= 5; i++){
            try {
                Thread.sleep(5000);
            }catch (InterruptedException  ex){
                ex.printStackTrace();
            }
            total = total + i;
        }
        System.out.println("Sum of the digits is " + total);
    }
}
