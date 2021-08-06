package com.javaTutorials.threading;


//MyThread ->  Thread -> Runnable
///MyRunnable -> MyRunnable extend Runnable interface and I can pass it as a parameter/target to Thread and start that thread...


public class MyThread extends Thread{

    @Override
    public void run(){
        int total = 0;
        for(int i = 1; i <= 5; i++){
            try {
                Thread.sleep(5000);
            }catch (InterruptedException  ex){
                ex.printStackTrace();
            }
            total = total + i;
        }
        System.out.println("Sum of the digits is " + total);
    }
}
