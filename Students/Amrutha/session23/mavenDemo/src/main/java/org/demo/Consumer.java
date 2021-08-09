package org.demo;

import lombok.AllArgsConstructor;

import java.util.Queue;
import java.util.Random;

@AllArgsConstructor
public class Consumer implements Runnable{
    private Queue<Integer> queue;
    private int capacity;

    @Override
    public void run() {
        while(true) {
            {
                synchronized(queue)
                {
                    try {
                        Thread.sleep(1000);
                        if (queue.size() == 0) {
                            System.out.println("Queue is empty and consumer going to waiting state");
                            queue.wait();
                        }
                        queue.remove();
                        System.out.println("consumer removed a item");
                        queue.notify();


                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }
}
