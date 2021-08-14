package com.javaTutorials.Interfaces;

public class AzureConsoleLogger implements Logger{

    @Override
    public void log() {
        System.out.println("Log to Azure Console");
    }
}
