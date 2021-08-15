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

    }
}
