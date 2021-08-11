package implimentThread;

public class Modulus implements Runnable
{
    Integer num1;
    Integer num2;

    public Modulus(Integer num1, Integer num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run()
    {
        try {
            Thread.sleep(5000);
            System.out.println("Modulus is : " + (num1 % num2) );
        }
        catch (InterruptedException exception)
        {
            exception.printStackTrace();
        }
    }

}
