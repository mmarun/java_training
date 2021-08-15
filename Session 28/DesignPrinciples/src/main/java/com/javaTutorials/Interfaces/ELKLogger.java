package com.javaTutorials.Interfaces;

public class ELKLogger implements Logger{

    @Override
    public void log() {
        System.out.println("Log  to ELK");
    } 
}
