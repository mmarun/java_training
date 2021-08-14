package com.java;
import com.java.Interfaces.FlyableInteface;
import com.java.Interfaces.SwimmableInterface;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    static Logger log = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {

    //Anonymous class
        FlyableInteface fly=new FlyableInteface() {
            @Override
            public void printFly() {
                System.out.println("Print fly");
            }
        };

        SwimmableInterface swim=new SwimmableInterface() {

            @Override
            public void swimDetails() {
                System.out.println("swimdetails");
            }

        };
        SwimmableInterface.swim();
    }
}
