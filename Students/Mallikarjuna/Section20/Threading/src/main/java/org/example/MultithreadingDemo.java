package org.example;

/**
 * Hello world!
 *
 */
class MultithreadingDemo implements Runnable {
    public void run()
    {
        try {

            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        }
        catch (Exception e) {

            System.out.println("Exception is caught");
        }
    }
}


