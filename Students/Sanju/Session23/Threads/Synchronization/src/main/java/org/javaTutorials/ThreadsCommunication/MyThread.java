package org.javaTutorials.ThreadsCommunication;

public class MyThread implements Runnable{
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        int result=1;
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(2000);
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
            result=result*i;
        }
        System.out.println("Multiplication Result of numbers from 1-5 " +result);
    }
}
