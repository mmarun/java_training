package com.javaTutorials.Interfaces;

public class DatabaseLogger implements Logger{
    @Override
    public void log() {
        System.out.println("Write to a database");
    }
}
