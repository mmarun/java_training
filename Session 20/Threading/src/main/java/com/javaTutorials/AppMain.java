package com.javaTutorials;

import com.javaTutorials.threading.MyThread;

public class AppMain {
    public static void main(String [] args)  {
        System.out.println("Hello world");

        //Expect a function..
        //Once that function is complete the thread will die..

        //Extending the Thread class..

       // sum();
       // sum();
       // sum();

        Thread myThread1 = new MyThread();
        Thread myThread2 = new MyThread();
        Thread myThread3 = new MyThread();

        myThread1.start();
        myThread2.start();
        myThread3.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread());
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
