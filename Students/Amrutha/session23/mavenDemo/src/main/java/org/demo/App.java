package org.demo;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 */
public class App {
    public static Logger logger=Logger.getLogger(App.class);
    public static void main(String[] args) throws Exception
    {
    //synchornized
    Queue<Integer> queue = new LinkedList<Integer>();
    Thread producer=new Thread(new Producer(queue,5),"producer");
    producer.setPriority(7);
    Thread consumer=new Thread(new Consumer(queue,5),"consumer");
    producer.start();
    consumer.start();
  //  logger.info("Successsful");

        System.out.println("Synchronized");
        Printer printer = new Printer();
        PrintTask wordTask = new PrintTask("wordFile", printer);
        PrintTask pdfTask = new PrintTask("pdfFile", printer);

        Thread th1 = new Thread(wordTask, "Word Printing Thread");
        Thread th2 = new Thread(pdfTask, "Pdf printing Thread");

        th1.start();
        th2.start();
    }
}
