package com.javaTutorials.Interfaces;

public class ConsoleLogger implements Logger{
    @Override
    public void log() {
        System.out.println("Write to a Computer screen");
    }
}