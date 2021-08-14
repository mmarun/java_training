package com.javaTutorials.Interfaces;

public class FileLogger implements Logger{
    @Override
    public void log() {
        System.out.println("Write to a file");
    }
}
