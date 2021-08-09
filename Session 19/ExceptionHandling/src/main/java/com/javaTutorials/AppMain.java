package com.javaTutorials;

import org.omg.CORBA.Environment;

import java.io.*;

public class AppMain {
    public static void main(String [] args) throws InterruptedException, IOException {
        Integer [] array = {1, 2, 3};
        Integer i = 0;
        writeFile("I:\\file.txt");

        readFile("I:\\file.txt");
        try {
           // System.out.println(array[5]);
            //i = getNum(i);
            //throw new NullPointerException("Arun");

        } catch(ArrayIndexOutOfBoundsException | NullPointerException ex){
            System.out.println("One " + ex.getMessage());

            ex.printStackTrace();

            System.out.println("Two - "+ ex);
            //Recovery logic
            i = 0;
        }



        //try, catch, throw, throws, finally

        System.out.println("Finished main program");
    }

    private static void writeFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw  = new PrintWriter(fw);
        try {
            pw.println("Arun");
            pw.println("Hyderabad");
            pw.println(32);
            if (1 == 1) {
                throw new NullPointerException("Throwing null pointer exception..");
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            pw.flush();
            pw.close();
        }
    }

    private static void readFile(String fileName) throws IOException{
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        try {
            String line = "";
            do {
                System.out.println(line);
                line = br.readLine();
            } while (line != null);
        } catch (Exception ex){
           //log the error
        } finally {
            br.close();
        }
    }


    private static Integer getNum(Integer i) throws InterruptedException {
        Thread.currentThread().sleep(3000);

        i = null;
        System.out.println(i.toString());
        return i;
    }
}
