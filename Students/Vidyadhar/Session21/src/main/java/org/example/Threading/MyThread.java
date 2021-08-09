package org.example.Threading;

public class MyThread extends Thread{
    @Override
    public void run() {
        int sum =0;

        for (int i=0;i<=5;i++)
        {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            sum = sum+i;
        }
        System.out.println("sum of the digits : "+sum);
    }
}
