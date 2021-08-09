package org.example;

import java.io.FileInputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FileInputStream fis = null;
        /*This constructor FileInputStream(File filename)
         * throws FileNotFoundException which is a checked
         * exception
         */
        fis = new FileInputStream("B:/myfile.txt");
        int k;

        /* Method read() of FileInputStream class also throws
         * a checked exception: IOException
         */
        while(( k = fis.read() ) != -1)
        {
            System.out.print((char)k);
        }

        /*The method close() closes the file input stream
         * It throws IOException*/
        fis.close();
    }
}
