package org.example;

public class MyRunnableThread implements Runnable {
    Integer fact;
    int result = 1;
    public MyRunnableThread(Integer fact)
    {
        this.fact=fact;
    }
    @Override
    public void run() {

        try {
            for (int i = fact; i > 1; i--) {
                Thread.sleep(1000);
                //System.out.println(result +"*"+ (i));
                result = result * i;
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Fact of "+fact+" is: "+result);

    }
}
