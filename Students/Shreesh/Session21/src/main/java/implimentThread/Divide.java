package implimentThread;

public class Divide implements Runnable,AutoCloseable{
    Integer x;
    Integer y;

    public Divide(Integer x,Integer y)
    {
        this.x =x;
        this.y =y;
    }

    @Override
    public void run()
    {
        try {
            Thread.sleep(4000);
            System.out.println("Division is : " + (x / y) );
        }
        catch (InterruptedException exception)
        {
            exception.printStackTrace();
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("Resource Closed");
    }
}
