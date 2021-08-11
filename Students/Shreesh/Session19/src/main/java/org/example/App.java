package org.example;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String filePath="D:\\";
        String fileName="FileOne";
        String fileName1="FileTwo";
        String fileName2="Result";
        String fileExtension =".txt";

        String firstFile=filePath+fileName+fileExtension;
        String secondFile=filePath+fileName1+fileExtension;
        String thirdFile=filePath+fileName2+fileExtension;

        FileHandler fileHandler=new FileHandler(firstFile);
        fileHandler.writeFile(fileName+ " hello this is File Handling Demo");
        fileHandler.writeFile(fileName+ " Here we are writing into file using printWriter class");
        fileHandler.writeFile(fileName+ " Here we have separated main runner class and file handler class ");
        fileHandler.writeFile(fileName+ " We can write into as many files by creating object");
        fileHandler.writeFile(fileName+ " File is created if not found");

        FileHandler fileHandler1=new FileHandler(secondFile);
        fileHandler1.writeFile(fileName1+ " This is first line on second file");
        fileHandler1.writeFile(fileName1+ " This is second line on second file");
        fileHandler1.writeFile(fileName1+ " This is third line on second file");
        fileHandler1.writeFile(fileName1+ " This is fourth line on second file");
        fileHandler1.writeFile(fileName1+ " This is fifth line on second file");

        System.out.println("..........Printing Files one by one..........");
        FileHandler resultFile=new FileHandler(thirdFile);
        //String line=null;
        for(int i=1;i<=5;i++) {
            resultFile.writeFile(fileHandler.readFile(i)+"\n"+fileHandler1.readFile(i));

        }

    }
}
