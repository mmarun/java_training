package org.demo;

import java.io.*;

public class MyRunnable implements Runnable, AutoCloseable {
    public static PrintWriter pw = null;

    @Override
    public void run() {
        String s="D:\\sample.txt";
        readFirstLineFromFileWithFinallyBlock(s);
    }

    @Override
    public void close() throws IOException {
        if (pw != null) {
            pw.close();
        }
    }

    static void readFirstLineFromFileWithFinallyBlock(String s) {

        try {

            pw = new PrintWriter(new File(s));
            pw.write("Like Java, Spring, Hibernate, Android");
            pw.flush();
            System.out.println("Successfully written");

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } finally {
            System.out.println("Finally block executed");


        }
    }
}


