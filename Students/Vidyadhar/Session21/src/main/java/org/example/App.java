package org.example;

import org.example.AutocloseableInterface.MyResource;
import org.example.Threading.MyRunneble;
import org.example.Threading.MyThread;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {

        //using Autocloseable-->try(resource)
        try(MyResource myResource = new MyResource())
        {
            System.out.println(myResource);
        }

        //Creating Three Thread by extending Thread class

        Thread myThread1 = new MyThread();
        Thread myThread2 = new MyThread();
        Thread myThread3 = new MyThread();

        myThread1.start();
        myThread2.start();
        myThread3.start();

        System.out.println(myThread1);
        myThread1.setName("FirstThread");
        System.out.println(myThread1);
        System.out.println("Extending Thread class thread1 name : "+myThread1.getName());


        //Creating Three Thread By implementing Runneable interface

        Thread thread1 = new Thread(new MyRunneble(),"Runnable1");
        System.out.println(thread1);
        System.out.println("implementing Runneable interface thread1 name : "+thread1.getName());

        Thread thread2 = new Thread(new MyRunneble());
        Thread thread3 = new Thread(new MyRunneble());

        thread1.start();
        thread2.start();
        thread3.start();

        //Creating Daemon Thread
        Thread daemonThread = new Thread(new MyRunneble(),"DaemonThread1");
        daemonThread.setDaemon(true);

        System.out.println("DaemonThread name : "+ daemonThread.getName());
        System.out.println("Checking the thread is Daemon :"+daemonThread.isDaemon());



    }
}
