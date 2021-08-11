package org.example;

public class ThreadDemo implements Runnable
{

    public static void main(String[] args)
    {
        ThreadDemo t=new ThreadDemo();
        Thread th=new Thread(t);
        th.start();

    }

    @Override
    public void run()
    {
        System.out.println("Hello thread practice");
    }
}
