package org.example;

import java.io.*;

public class FileHandler
{
    String fileName;
    FileWriter fileWriter;
    PrintWriter printWriter;
    FileReader fileReader;
    BufferedReader bufferedReader;

    FileHandler(String fileName) {
        File file = new File(fileName);
        this.fileName=fileName;
    }

    public void writeFile(String message)
    {
        try
        {
            fileWriter=new FileWriter(fileName,true);
            printWriter=new PrintWriter(fileWriter);
            printWriter.println(message);
        }
        catch (IOException ioException)
        {
            ioException.printStackTrace();
        }
        finally {
            printWriter.flush();
            printWriter.close();
            //System.out.println("File Write Successfully");
        }
    }
    public String readFile(Integer lineNumber)
    {
        String line=null;
        try
        {
            fileReader=new FileReader(fileName);
            bufferedReader= new BufferedReader(fileReader);
            for(int i=1;i<=lineNumber;i++) {
                 line= bufferedReader.readLine();
            }

        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }
        finally {
            return line;
        }
    }
}
