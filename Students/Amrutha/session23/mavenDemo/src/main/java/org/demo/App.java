package org.demo;

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
    public static void main(String[] args) throws Exception
    {
    //synchornized
    Queue<Integer> queue = new LinkedList<Integer>();
    Thread producer=new Thread(new Producer(queue,5),"producer");
    producer.setPriority(7);
    Thread consumer=new Thread(new Consumer(queue,5),"consumer");
    producer.start();
    consumer.start();

    }
}
