package implimentThread;

public class Percent implements Runnable {
    Integer amount;
    Integer percentOf;

    public Percent(Integer amount, Integer percentOf)
    {
        this.amount = amount;
        this.percentOf = percentOf;
    }

    @Override
    public void run()
    {
        try {
            Thread.sleep(6000);
            System.out.println("Percent is : " + (amount / (percentOf/100)) + "%");
        }
        catch (InterruptedException exception)
        {
            exception.printStackTrace();
        }
    }
}
