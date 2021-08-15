package org.javaTutorials;

import org.javaTutorials.Threading.MyThread;
import org.javaTutorials.Threading.FileAutoclose;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws Exception , InterruptedException{

        // creating 3 threads
        Thread thread1=new MyThread();
        Thread thread2=new MyThread();
        Thread thread3=new MyThread();

        thread1.setDaemon(true);

        thread1.start();
        thread2.start();
        thread3.start();

        //creating 3 threads with names
        Thread run_thread1=new Thread(new MyThread(),"Sanju");
        System.out.println(run_thread1);
        Thread run_thread2=new Thread(new MyThread(),"Jovina");
        Thread run_thread3=new Thread(new MyThread(),"Jocelyn");

        run_thread1.start();
        run_thread2.start();
        run_thread3.start();


        //creating threads implementing autoclosing method
        Thread filethread1= new FileAutoclose();
        Thread filethread2= new FileAutoclose();
        Thread filethread3= new FileAutoclose();

        filethread1.start();
        filethread2.start();
        filethread3.start();

        //setting Deomon



    }
}
