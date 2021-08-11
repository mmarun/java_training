package extendThread;

public class Minus extends Thread
{
    Integer j;
    Integer k;

    public Minus(Integer j,Integer k)
    {
        this.j =j;
        this.k =k;
    }

    @Override
    public void run()
    {
        try {
            Thread.sleep(2000);
            System.out.println("Subtraction is : " + (j - k) );
        }
        catch (InterruptedException exception)
        {
            exception.printStackTrace();
        }
    }
}
