package org.javaTutorials;

import org.javaTutorials.CheckedExceptions.CheckedExceptionClass;
import org.javaTutorials.UnCheckedExceptions.UncheckedExceptionClass;

import java.io.*;



/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException{
//Created tow files namely one.txt,two.txt

        File fileName1=new File("F:\\Git-Repo\\java_training\\Students\\Sanju\\Session20\\one.txt");
        File fileName2=new File("F:\\Git-Repo\\java_training\\Students\\Sanju\\Session20\\two.txt");



        PrintWriter pw1=new PrintWriter(new FileWriter(fileName1));
        PrintWriter pw2=new PrintWriter(new FileWriter(fileName2));

        try{
            pw1.println("Sanju Mathew");
            pw1.println("Bangalore");
            pw1.println(50000);
            pw1.println("Development");
            pw1.println(987654321);
        }finally {
            pw1.flush();
            pw1.close();
        }
        System.out.println("File 1 write complete");

        try{
            pw2.println("Bibin Joseph");
            pw2.println("Andra Pradesh");
            pw2.println(60000);
            pw2.println("Test");
            pw2.println(966654321);

            //throwing customized Exception-- checked exception class
            throw new CheckedExceptionClass("Thrown Checked Exception");
        }catch (CheckedExceptionClass ex){
            ex.printStackTrace();
        }finally{
            pw2.flush();
            pw2.close();
        }


        System.out.println("File 2 write complete");

        System.out.println("Reading Starting from file one & two Alternatevely");

        // craeting a file result.txt
        File fileName3= new File("F:\\Git-Repo\\java_training\\Students\\Sanju\\Session20\\result.txt");

        PrintWriter pw3= new PrintWriter(new FileWriter(fileName3));

        // creating Buffer reader
        BufferedReader bf1=new BufferedReader(new FileReader(fileName1));
        BufferedReader bf2=new BufferedReader(new FileReader(fileName2));


        try{
            String line1="This is the file merged with one.txt & two.txt";
            String line2="Writing started -- writing lines alternatively";
            do{
                pw3.println(line1);
                line1=bf1.readLine();
                System.out.println(line1);

                pw3.println(line2);
                System.out.println(line2);
                line2=bf2.readLine();

                // calling Customised Exception-- Unchecked class
                throw new UncheckedExceptionClass("Unchecked Exception Called");
            }while(line1 !=null || line2 !=null);
        }catch (Exception ex) {
            ex.printStackTrace();

        } finally {
            pw3.flush();
            pw3.close();
            bf1.close();
        }


    }
}
