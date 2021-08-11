package org.example;


public class App {
    public static void main(String args[])throws Exception
    {
       try( ThreadA a = new ThreadA())
       {
           a.isDaemon(true);
           a.setDaemon(true);
           a.ExecuteAction();

       }
        try(ThreadB b = new ThreadB())
        {
            b.isDaemon(true);
            b.setDaemon(true);
            b.ExecuteAction();
        }

        try(ThreadC c = new ThreadC())
        {
            c.isDaemon(true);
            c.setDaemon(true);
            c.ExecuteAction();
        }
        System.out.println("Threads by implementing the Autoclosable interface.");
    }
}