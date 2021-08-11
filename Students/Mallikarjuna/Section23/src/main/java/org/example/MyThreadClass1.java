package org.example;

public class MyThreadClass1 extends Thread{

    @Override
    public void run() {
        int total = 0;
        for(int i = 1; i <= 5; i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException  ex){
                ex.printStackTrace();
            }
            total = total + i;
        }
        System.out.println("Sum of the digits is " + total);
    }

}
