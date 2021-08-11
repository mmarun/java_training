package org.example;

import java.io.*;

public class MyRunnable implements Runnable, AutoCloseable {
    public static PrintWriter p = null;

    @Override
    public void run() {
        String s="F:\\Demo.txt";
        readFirstLineFromFileWithFinallyBlock(s);
    }

    @Override
    public void close() throws IOException {
        if (p != null) {
            p.close();
        }
    }

    static void readFirstLineFromFileWithFinallyBlock(String s) {

        try {

            p = new PrintWriter(new File(s));
            p.write("sql, core java, Advance java, springs");
            p.flush();
            System.out.println("Successfully written");

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } finally {
            System.out.println("Finally block executed");


        }
    }
}