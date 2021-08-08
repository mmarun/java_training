package org.demo;

import org.apache.log4j.Logger;

public class MyThreadDemoMain{

    public static final Logger logger=Logger.getLogger(MyThreadDemoMain.class);
    public static void main(String[] args) {
   /* sum();
    sum();
    sum();*/
    //MultiThreading
        Thread myThread1 = new MyThread();
        Thread myThread2 = new MyThread();
        Thread myThread3 = new MyThread();
        logger.info("Thread starting");
        myThread1.start();
        myThread2.start();
        myThread3.start();

    }
    public static void sum() {
        int sum=0;
        for (int i = 1; i <= 10; i++) {
            sum=sum+i;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("sum:"+sum);
    }
}