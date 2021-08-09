package org.example;

import org.example.CheckedException.CompiletimeException;
import org.example.UnchekedException.CustomRuntimeException;

import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, CompiletimeException {
        File fOne = new File("D:\\Git-Repo\\javaprgm\\Session18\\One.txt");
        File fTwo = new File("D:\\Git-Repo\\javaprgm\\Session18\\Two.txt");


        FileWriter Firstfile = new FileWriter(fOne);
        FileWriter Secondfile = new FileWriter(fTwo);

       //writing to the first file
        PrintWriter pw1 = new PrintWriter(Firstfile);

        try {

            pw1.println("Firstline of One.txt");
            pw1.println("Secondline of One.txt");
            pw1.println("Thirdline of One.txt");
            pw1.println("Fourthline of One.txt");
            pw1.println("Fifthline of One.txt");

            //Throwing CustomChecked Exception
            throw new CompiletimeException();

        }
        catch (CompiletimeException ex)
        {
            System.out.println(ex);
            ex.printStackTrace();
        }
        finally {
            pw1.flush();
            pw1.close();

        }

        System.out.println("First file writing completed");
        //Writing to the Second file

        PrintWriter pw2  = new PrintWriter(Secondfile);

        try {
            pw2.println("Firstline of Two.txt");
            pw2.println("Secondline of Two.txt");
            pw2.println("Thirdline of Two.txt");
            pw2.println("Fourthline of Two.txt");
            pw2.println("Fifthline of Two.txt");

            throw new CustomRuntimeException();
        }
        catch (CustomRuntimeException ex)
        {
            System.out.println(ex);
            ex.printStackTrace();
        }
        finally {
            pw2.flush();
            pw2.close();

        }

        System.out.println("Second file writing completed");

            File fThree = new File("D:\\Git-Repo\\javaprgm\\Session18\\Result.txt");
            FileWriter Resultfile = new FileWriter(fThree);

            PrintWriter pw3 = new PrintWriter(Resultfile);

            //Reading from both the files
            FileReader fileReader1 = new FileReader(fOne);
            FileReader fileReader2 = new FileReader(fTwo);
            BufferedReader br1 = new BufferedReader(fileReader1);
            BufferedReader br2 = new BufferedReader(fileReader2);

            try
            {
            String file1Line = " ";
            String file2Line = " ";

            while (file1Line != null || file2Line != null) {
                pw3.println(file1Line);
                file1Line = br1.readLine();

                pw3.println(file2Line);
                file2Line = br2.readLine();
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            pw3.flush();
            pw3.close();
            br1.close();
            br2.close();
        }


    }
}
