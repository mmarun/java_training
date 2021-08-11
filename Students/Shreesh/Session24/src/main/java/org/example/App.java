package org.example;

import com.interfaceExam.Running;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Vehicle vehicle=new Vehicle("Audi",4);
        vehicle.startVehicle();
        try {

            for (int i = 1; i < 9; i++) {
                Thread.sleep(700);
                System.out.println("Adding Speed ..current speed is.." + Running.accelerate(i));
            }

            System.out.println("hitting break...speed is.."+ vehicle.stopBreak());
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        Vehicle vehicle1=new Vehicle(){
            @Override
            public void startVehicle() {
                System.out.println("Anonymous class invoking");
            }
        };
        vehicle1.setName("plane");
        vehicle1.setWheel(5);
        try {

            for (int i = 100; i < 119; i++) {
                Thread.sleep(300);
                System.out.println("Adding Speed ..current speed is.." + Running.accelerate(i));
            }

            System.out.println("hitting break...speed is.."+ vehicle1.stopBreak());
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }


    }
}
