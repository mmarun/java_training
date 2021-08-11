package org.example;

class ThreadB extends Thread
{
    public void run()
    {
        for (int j = 1; j <= 5; j++)
        {
            System.out.println("From Thread B with j= " + 2 * j);
        }
        System.out.println("Exiting from Thread B ...");
    }
}
