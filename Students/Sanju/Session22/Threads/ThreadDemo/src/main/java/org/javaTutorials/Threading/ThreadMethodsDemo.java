package org.javaTutorials.Threading;

public class ThreadMethodsDemo extends Thread implements Runnable{

    @Override
    public  void run(){
        int result= 1;
        for (int i=1;i<=5;i++){
            try{
               // Thread.sleep(1000);

            }catch (Exception ex){
                ex.printStackTrace();
            }
            result=result*i;
        }
        System.out.println("Result of Multiplying numbers 1-5 is--- "+ result);
    }
}
