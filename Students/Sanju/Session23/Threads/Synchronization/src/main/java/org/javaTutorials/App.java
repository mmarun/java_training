package org.javaTutorials;


import org.javaTutorials.MultiThreading.Printer;
import org.javaTutorials.MultiThreading.PrintingTask;
import org.javaTutorials.ThreadsCommunication.Consumer;
import org.javaTutorials.ThreadsCommunication.Producer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
       /* Printer word=new Printer();
        PrintingTask wordTask= new PrintingTask("Word File", word);
        PrintingTask pdfTask= new PrintingTask("PDF File", word);

        Thread wordThread=new Thread(wordTask,"Word File Thread");
        Thread pdfThread=new Thread(pdfTask,"PDF File Thread");
        pdfThread.setPriority(1);
        wordThread.start();
        pdfThread.start();
*/

        // Intercommunication with Threads
        Queue<Integer> queue= new LinkedList<Integer>();
        Thread producerThread=new Thread(new Producer(queue,5),"Producer Thread");
        producerThread.setPriority(Thread.NORM_PRIORITY);
        Thread consumerThread= new Thread(new Consumer(queue,5),"Consumer Thread");

        producerThread.start();
        consumerThread.start();

    }
}
