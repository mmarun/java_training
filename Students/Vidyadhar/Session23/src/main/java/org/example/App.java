package org.example;

import org.example.Threadingprogram.Consumer;
import org.example.Threadingprogram.Printer;
import org.example.Threadingprogram.PrinterTask;
import org.example.Threadingprogram.Producer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Hello world!
 *
 */
public class App extends Object {

    public static void main(String[] args ) {

//        Printer printer = new Printer();
//        PrinterTask wordTask = new PrinterTask("wordFile",printer);
//        PrinterTask pdfTask = new PrinterTask("pdfFile",printer);
//
//        Thread thread1 = new Thread(wordTask,"wordFile Task");
//        Thread thread2  = new Thread(pdfTask,"pdfFile Task");
//
//        thread1.start();
//        thread2.start();


        Queue<Integer> queue = new LinkedList<>();

        Thread producerthread = new Thread(new Producer(queue,5),"ProducerThread");

        Thread consumerThread1 = new Thread(new Consumer(queue,5),"ConsumerThread1");
        Thread consumerthread2 = new Thread(new Consumer(queue,5),"ConsumerThread2");

        producerthread.start();
        consumerThread1.start();
        consumerthread2.start();

    }
}
