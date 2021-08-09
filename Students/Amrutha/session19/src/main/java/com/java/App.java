package com.java;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.*;


/**
 * Hello world!
 *
 */
public class App {

    public static final Logger log=Logger.getLogger(App.class);
    //String log4jConfPath = "log4j.properties";

    public static void main(String[] args) throws InterruptedException, IOException {

        String file1 = "C:\\git_repo\\java_training\\Students\\Amrutha\\session19\\One.txt";
        String file2 = "C:\\git_repo\\java_training\\Students\\Amrutha\\session19\\Two.txt";
        String file3 = "C:\\git_repo\\java_training\\Students\\Amrutha\\session19\\Result.txt";

        List names=new ArrayList<>(Arrays.asList("Amrutha","Sudheesh","Maneesh","Jayan","Kumar"));
        List places=new ArrayList<>(Arrays.asList("Kerala","Hyderabad","Bangalore","Chennai","Coimabatore"));
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
