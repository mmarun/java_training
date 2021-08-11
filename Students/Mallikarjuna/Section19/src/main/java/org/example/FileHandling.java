package org.example;

import org.apache.log4j.Logger;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandling
{
    List readFromOutputFile(String file3) throws IOException {
        List newList=new ArrayList();
        File file=new File(file3);
        FileReader fileReader = new FileReader(file);
        BufferedReader br1 = new BufferedReader(fileReader);

        try {
            String line1 = "";

            do {
                System.out.println(line1);
                if(!line1.equals(""))
                    newList.add(line1);
                line1 = br1.readLine();


            } while (line1 != null);

        } catch (Exception ex) {

        } finally {
            br1.close();
        }
        return newList;
    }
    Boolean deleteFileExist(String s)
    {
        File existFile=new File(s);
        if(existFile.exists())
        {
            Boolean status=existFile.delete();
        }
        return true;
    }
    void writeFile(String fileName, List list) throws IOException {

        File file=new File(fileName);
        FileWriter fw = new FileWriter(fileName, true);
        PrintWriter pw = new PrintWriter(fw);
        try {
            for (Object l : list) {
                pw.println(l.toString());
            }


        } catch (Exception ex) {

        } finally {
            pw.flush();
            pw.close();
        }

    }

    public List createNewFile(String fileName1, String fileName2) throws IOException {
        List newList=new ArrayList();
        File file1=new File(fileName1);
        FileReader fileReader = new FileReader(file1);
        File file2=new File(fileName2);
        FileReader fileReader1 = new FileReader(file1);
        BufferedReader br1 = new BufferedReader(fileReader1);
        FileReader fileReader2 = new FileReader(fileName2);
        BufferedReader br2 = new BufferedReader(fileReader2);
        try {
            String line1 = "";
            String line2 = "";
            do {
                if(line1!="" && line2!=null) {
                    newList.add(line1);
                    newList.add(line2);
                }
                line1 = br1.readLine();
                line2 = br2.readLine();


            } while (line1 != null && line2!= null);

        } catch (Exception ex) {

        } finally {
            br1.close();
        }
        return newList;
    }


    int status()
    {
        try
        {
            System.out.println("try block");
            return 1;
        }
        finally {
            System.out.println("finally block");
            return 5;
        }
    }
}
