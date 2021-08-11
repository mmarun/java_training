package org.example;

class ThreadC extends Thread
{
    public void run( )
    {
        for(int k = 1; k <= 5; k++)
        {
            System.out.println("From Thread C with k = "+ (2*k-1));
        }
        System.out.println("Exiting from Thread C ...");
    }
}
