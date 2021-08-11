package extendThread;

public class Multiply extends Thread implements AutoCloseable
{
    Integer m;
    Integer n;

    public Multiply(Integer m,Integer n)
    {
        this.m =m;
        this.n = n;
    }

    @Override
    public void run()
    {
        try {
            Thread.sleep(3000);
            System.out.println("Multiplication is : " + (m * n) );
        }
        catch (InterruptedException exception)
        {
            exception.printStackTrace();
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("Resource Closed ...");
    }
}
