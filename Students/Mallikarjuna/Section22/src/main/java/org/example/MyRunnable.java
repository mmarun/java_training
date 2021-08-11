package org.example;
import java.io.*;

public class MyRunnable implements Runnable {


    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("This is a join thread:"+Thread.currentThread().getName());

    }
}