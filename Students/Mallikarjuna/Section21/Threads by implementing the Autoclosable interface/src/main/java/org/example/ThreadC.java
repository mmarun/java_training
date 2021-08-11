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
}
