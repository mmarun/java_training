package org.example;

class ThreadA implements AutoCloseable {
    public void ExecuteAction()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("From Thread A with i = " + -1 * i);
        }
        System.out.println("Exiting from Thread A ...");
    }

    @Override
    public void close() throws Exception
    {
        System.out.println("ThreadA closed");
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
