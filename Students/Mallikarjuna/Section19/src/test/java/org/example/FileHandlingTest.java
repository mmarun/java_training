package org.example;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileHandlingTest  {

    FileHandling fileHandling;
    private long True;
    String trial1 ="C:\\git_repo\\java_training\\java_training\\Students\\Mallikarjuna\\Section19\\19.1st.txt";
    String trial2 = "C:\\git_repo\\java_training\\java_training\\Students\\Mallikarjuna\\Section19\\19.2st.txt";

    @Before
    public void setUp(){
        fileHandling=new FileHandling();
    }


    @Test
    public void WriteFileTest() throws IOException
    {
        fileHandling.deleteFileExist(trial1);
        fileHandling.deleteFileExist(trial2);
        List names=new ArrayList<>(Arrays.asList("Amrutha","Sudheesh"));
        fileHandling.writeFile(trial1,names);
        List l=fileHandling.readFromOutputFile(trial1);
        Assert.assertEquals(names,l);
    }
    @Test(expected = FileNotFoundException.class)
    public void negativeWriteFileTest() throws IOException
    {
        fileHandling.deleteFileExist(trial1);
        fileHandling.deleteFileExist(trial2);
        String file1 = "";
        List names=new ArrayList<>();
        fileHandling.writeFile(file1,names);
        Assert.assertEquals(names,fileHandling.readFromOutputFile(file1));
    }

    @After
    public void tearDown(){
        fileHandling=null;
    }
}
