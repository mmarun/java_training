package org.javaTutorials.Threading;


public class MyThread extends Thread implements Runnable{


    @Override
    public void run(){
        int result= 1;
        for (int i=1;i<=10;i++){
            try{
                Thread.sleep(2000);

                }catch (Exception ex){
                ex.printStackTrace();
            }
            result=result*i;
        }
          System.out.println(Thread.currentThread().getName()+"Result of Multiplying numbers 1-10 is--- "+ result);
        }




}
