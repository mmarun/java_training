package com.javaTutorials;

import com.javaTutorials.Interfaces.AWSConsoleLogger;
import com.javaTutorials.Interfaces.AzureConsoleLogger;

public class Main {
    public static void main(String[] args){


        //Open for extension closed for modification... concept..
        //Observer pattern..
        //Head first design pattern..
        //Publisher will send alert to any number of subscribers he does not care if subscriber takes any action or not
        //
        Client client = new Client();
        client.processLog(new AzureConsoleLogger());

        Singleton mySingleton = Singleton.getSingleton();
        mySingleton.printFreeMemory();
        System.out.println(mySingleton.hashCode());

        // other instance
        Singleton yourSingleton = Singleton.getSingleton();
        yourSingleton.printFreeMemory();
        System.out.println(yourSingleton.hashCode());

        //BankAccount(Double Amount)  Gold - 10000, Silver - 0 no, Platinum -100000 3rewards
        System.out.println(yourSingleton == mySingleton);

    }
}
