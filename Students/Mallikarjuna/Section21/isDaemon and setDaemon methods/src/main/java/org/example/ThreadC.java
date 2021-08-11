package org.example;

class ThreadC implements AutoCloseable {
    public void ExecuteAction( )
    {
        for(int k = 1; k <= 5; k++)
        {
            System.out.println("From Thread C with k = "+ (2*k-1));
        }
        System.out.println("Exiting from Thread C ...");
    }

    @Override
    public void close() throws Exception
    {
        System.out.println("ThreadC closed");
    }

    public void setDaemon(boolean b)
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("daemon thread work");
        }
        else
        {
            System.out.println("user thread work");
        }
    }

    public void isDaemon(boolean b)
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("daemon thread work");
        }
        else
        {
            System.out.println("user thread work");
        }
    }
}
