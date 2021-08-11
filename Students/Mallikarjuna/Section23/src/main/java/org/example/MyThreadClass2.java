package org.example;

public class MyThreadClass2 extends Thread{
    @Override
    public void run() {
        int mul = 1;
        for(int i = 1; i <= 5; i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException  ex){
                ex.printStackTrace();
            }
            mul = mul * i;
        }
        System.out.println("Multiply of the digits is " + mul);
    }
}