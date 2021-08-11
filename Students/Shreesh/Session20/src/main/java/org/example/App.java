package org.example;

import autoClosableDemo.Customer;
import customException.CustomChecked;
import customException.CustomUnchecked;

import java.io.File;
import java.io.FileReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int i=2;


        try {
            Customer customer=new Customer(12,16);
            System.out.println("Customer stayed for " + customer.getTime() +" Minutes");
            customer.close();

            if (i==0) {
                throw new CustomChecked("Throws Custom Checked Exception");
            }
            else {
                throw new CustomUnchecked("Throws Custom Unchecked Exception");
            }

        }
        catch (CustomChecked ex)
        {
            ex.printStackTrace();
        }
        catch (CustomUnchecked uex)
        {
            uex.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
