package org.demo;

public class MyThread extends Thread {

    @Override
    public void run()
    {
        int sum=0;
        for (int i = 1; i <= 10; i++) {
            sum=sum+i;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Threadsum:"+sum);
    }

}
