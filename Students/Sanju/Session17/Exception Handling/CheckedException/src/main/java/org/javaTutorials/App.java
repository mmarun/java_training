package org.javaTutorials;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        try{
            FileInputStream fileinput=new FileInputStream("F:/fileread.txt");
            
        }catch(FileNotFoundException ex){
            System.out.println("No Such File Found");
        }
        System.out.println("------FileNotFoundException Done----");
    }
}
