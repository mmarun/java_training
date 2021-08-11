package org.example;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.*;

public class App
{
    public static final Logger log=Logger.getLogger(App.class);


    public static void main(String[] args) throws InterruptedException, IOException {

        String file1 = "C:\\git_repo\\java_training\\java_training\\Students\\Mallikarjuna\\Section19\\1st.txt";
        String file2 = "C:\\git_repo\\java_training\\java_training\\Students\\Mallikarjuna\\Section19\\2nd.txt";
        String file3 = "C:\\git_repo\\java_training\\java_training\\Students\\Mallikarjuna\\Section19\\Result.txt";

        List names=new ArrayList<>(Arrays.asList("Malli","Arjun","Monappa","Bindya","Nalini"));
        List places=new ArrayList<>(Arrays.asList("Manglore","Madikeri","Bangalore","Mysore","Davangere"));
        FileHandling fileHandling=new FileHandling();
        fileHandling.deleteFileExist(file1);
        fileHandling.deleteFileExist(file2);
        fileHandling.deleteFileExist(file3);
        log.info("Deletd existing files");
        fileHandling.writeFile(file1,names);
        fileHandling.writeFile(file2,places);
        List list=fileHandling.createNewFile(file1,file2);
        fileHandling.writeFile(file3,list);
        fileHandling.readFromOutputFile(file3);
        System.out.println(fileHandling.status());
    }
}
