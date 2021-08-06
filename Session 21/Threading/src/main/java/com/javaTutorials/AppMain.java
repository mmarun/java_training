package com.javaTutorials;

import com.javaTutorials.exceptions.MyResource;
import com.javaTutorials.exceptions.NormalResource;
import com.javaTutorials.threading.MyRunnable;
import com.javaTutorials.threading.MyThread;

public class AppMain {
    public static void main(String [] args)  throws Exception {

        try (MyResource myResource = new MyResource()){
            System.out.println(myResource);
        }

        //Expect a function..
        //Once that function is complete the thread will die..

        //Extending the Thread class..

       // sum();
       // sum();
       // sum();
    /*
        Thread myThread1 = new MyThread();
        System.out.println(myThread1);

        Thread myThread2 = new MyThread();
        Thread myThread3 = new MyThread();

        myThread1.start();
        myThread2.start();
        myThread3.start();


        Thread thread1 = new Thread(new MyRunnable(), "Arun");
        System.out.println(thread1);
        Thread thread2 = new Thread(new MyRunnable());
        Thread thread3 = new Thread(new MyRunnable());
        thread1.start();
        thread2.start();
        thread3.start();

        */

        //Thread ..
        //Until all threads are running even if the main thread finshes its execution the program will continue ot run..
        Thread th = new Thread(new MyRunnable());
        th.setDaemon(true);
        th.start();

        System.out.println("Is the thread a daemon " + th.isDaemon());

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread());
        System.out.println("Exiting the main thread...");
    }

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
