package org.example;

class ThreadB implements AutoCloseable {
    public void ExecuteAction()
    {
        for (int j = 1; j <= 5; j++)
        {
            System.out.println("From Thread B with j= " + 2 * j);
        }
        System.out.println("Exiting from Thread B ...");
    }

    @Override
    public void close() throws Exception
    {
        System.out.println("ThreadB closed");
    }
}
