package extendThread;

public class Sum extends Thread{
    Integer a;
    Integer b;

    public Sum(Integer a,Integer b)
    {
        this.a=a;
        this.b=b;
    }

    @Override
    public void run()
    {
        try {
            Thread.sleep(1000);
            System.out.println("Sum is : " + (a+b) );
        }
        catch (InterruptedException exception)
        {
            exception.printStackTrace();
        }
    }

}
