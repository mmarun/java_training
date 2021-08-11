package org.anonymousClass;

class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("i am "+ Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        System.out.println("this thread is:"+ Thread.currentThread().getName());
        MyThread t1 = new MyThread();
        Thread th = new Thread(t1);
        th.start();

        //Anonymous class
        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("i am anonymous class thread"+ Thread.currentThread().getName());
            }
        }
        ;
        Thread th2 = new Thread(t2);
        th2.start();

        //Anonymous class
        Runnable t3 = new Runnable() {
            @Override
            public void run() {
                System.out.println("i am 2nd anonymous class thread"+ Thread.currentThread().getName());
            }
        }
                ;
        Thread th3 = new Thread(t3);
        th3.start();

    }
}
