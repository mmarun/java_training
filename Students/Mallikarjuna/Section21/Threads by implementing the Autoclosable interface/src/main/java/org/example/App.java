package org.example;


public class App {
    public static void main(String args[])throws Exception
    {
       try( ThreadA a = new ThreadA()){
           a.ExecuteAction();
       }
        try(ThreadB b = new ThreadB())
        {
            b.ExecuteAction();
        }

        try(ThreadC c = new ThreadC())
        {
            c.ExecuteAction();
        }
        System.out.println("Threads by implementing the Autoclosable interface.");
    }
}