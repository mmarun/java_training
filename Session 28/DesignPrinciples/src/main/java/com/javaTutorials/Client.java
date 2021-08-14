package com.javaTutorials;

import com.javaTutorials.Interfaces.*;

public class Client {
    public void processLog(AzureConsoleLogger logger){
/*  OPEN TO EXTENSION but also was OPEN FOR MODIFICATION  --- BAD CODE..
        if (logger instanceof DatabaseLogger){
            System.out.println("Log to database");
        }
        else if (logger instanceof ConsoleLogger){
            System.out.println("Log to console");
        }
        else if (logger instanceof ELKLogger) {
            System.out.println("Log to Queue");
        }
        else {
            System.out.println("Log to file");
        }
*/
        logger.log();
    }
}
