package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IoException
{
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:\\Users\\Public\\Documents");
        BufferedReader fileInput = new BufferedReader(file);

        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());

        fileInput.close();
    }
}