package org.example.Threadingprogram;

public class MyResource implements Runnable{

    @Override
    public void run() {
        int sum = 0;

        for (int i=0;i<5;i++)
        {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sum=sum+1;
        }
        System.out.println("sum of the digits :" +sum);

    }
}
