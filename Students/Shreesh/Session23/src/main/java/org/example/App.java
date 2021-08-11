package org.example;

import com.threadSync.PrintPage;
import com.threadSync.Printing;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try
        {
            Queue<Integer> queue = new LinkedList<Integer>();
            Thread producerThread = new Thread(new Producer(queue, 10), "Producer Thread");
            producerThread.setPriority(Thread.NORM_PRIORITY);
            Thread customerThread = new Thread(new Customer(queue, 10), "First Customer Thread");
            Thread customerThread2 = new Thread(new Customer(queue, 10), "Second Customer Thread");
            customerThread2.setPriority(7);

            //producerThread.start();
            //customerThread.start();
            //customerThread2.start();

            Printing printing = new Printing();
            PrintPage wordTask = new PrintPage("wordFile", printing);
            PrintPage pdfTask = new PrintPage("excelFile", printing);

            Thread th1 = new Thread(wordTask, "Word print Thread");
            Thread th2 = new Thread(pdfTask, "Excel print Thread");

            th1.start();
            th2.start();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
