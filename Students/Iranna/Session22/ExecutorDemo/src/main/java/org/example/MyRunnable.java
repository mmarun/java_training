package org.example;




public class MyRunnable implements Runnable{
    @Override
    public void run() {
        int m =1;

        for(int i=1;i<=10;i++)
        {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            m = m * i;
        }
        System.out.println("multpliction  of the Digits : "+ m +" "+Thread.currentThread().getName());

    }
}

