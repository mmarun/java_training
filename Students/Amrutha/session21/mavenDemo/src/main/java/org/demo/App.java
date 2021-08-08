package org.demo;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyThreadClass(), "Thread1");
        Thread thread2 = new Thread(new MyThreadClass(), "Thread2");
        Thread thread3 = new Thread(new MyThreadClass(), "Thread3");
        Thread thread4 = new Thread(new MyThreadClass(), "Thread4");
        Thread thread5 = new Thread(new MyThreadClass(), "Thread5");
        System.out.println(Thread.currentThread().getName());
        Thread myanotherThread = new Thread(new MyThread2Class());
        myanotherThread.setDaemon(true);
        myanotherThread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


        Thread myRunnable=new Thread(new MyRunnable(),"My runnable thread");
        myRunnable.start();

    }
}
