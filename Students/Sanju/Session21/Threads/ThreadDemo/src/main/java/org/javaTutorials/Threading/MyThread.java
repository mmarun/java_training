package org.javaTutorials.Threading;


public class MyThread extends Thread implements Runnable{

    @Override
    public void run(){
        int result= 1;
        for (int i=1;i<=10;i++){
            try{
                Thread.sleep(3000);

            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
            result=result*i;
        }
        if(Thread.currentThread().isDaemon()){
            System.out.println("Deemon Thread");
        }
        else{
            System.out.println("Not a Deamon");
        }
        System.out.println("Result of Multiplying numbers 1-10 is--- "+ result);
        }



}
