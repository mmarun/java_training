package com.javaTutorials.Interfaces;

public class AWSConsoleLogger implements Logger{
    @Override
    public void log() {
        System.out.println("LOG to AWS console...");
    }
}
