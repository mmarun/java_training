package com.javaTutorials;

//Today's topics - Synchronized keyword, wait, notify, notifyAll


import com.javaTutorials.threading.Consumer;
import com.javaTutorials.threading.PrintTask;
import com.javaTutorials.threading.Printer;
import com.javaTutorials.threading.Producer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;


//In java to have sychronization the concept of locks is used.
//Once you enter a function of an object if it is synchronized you get a lock of that object.
//and no body can enter that function until the lock is released...

//There is a possiblity that a thread needs to go into a waiting state when he has entered the sychronized block...
// when a thread goes into waiting state it releases the lock so that other threads can get access to that lock..
//the other function will have access to that lock will do their job and then invoke notify..
// once they invoke notify they themselves go to waiting state.. but they will not go waiting immediately..

public class AppMain extends Object {
    public static void main(String [] args)  throws Exception {
        //synchDemo();

        Queue<Integer> queue = new LinkedList<Integer>();
        Thread producerThread = new Thread(new Producer(queue, 5), "Producer Thread");
        producerThread.setPriority(Thread.NORM_PRIORITY);
        Thread consumerThread = new Thread(new Consumer(queue, 5), "Consumer1 Thread");
        Thread consumerThread2 = new Thread(new Consumer(queue, 5), "Consumer2 Thread");

        producerThread.start();
        consumerThread.start();
        consumerThread2.start();
    }

    private static void synchDemo () {
        Printer printer = new Printer();
        PrintTask wordTask = new PrintTask("wordFile", printer);
        PrintTask pdfTask = new PrintTask("pdfFile", printer);

        Thread th1 = new Thread(wordTask, "Word Printing Thread");
        Thread th2 = new Thread(pdfTask, "Pdf printing Thread");

        th1.start();
        th2.start();
    }
}
