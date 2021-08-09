package org.demo;

import lombok.AllArgsConstructor;

import java.util.Queue;
import java.util.Random;

@AllArgsConstructor
public class Producer implements Runnable{
    private Queue<Integer> queue;
    private int capacity;

    @Override
    public void run() {
        while(true) {
            {
                synchronized (queue) {
                    Random random = new Random();
                    int value = random.nextInt(100);
                    try {
                        Thread.sleep(1000);
                        if (queue.size() == capacity) {
                            System.out.println("Queue is full and producer going to waiting state");
                            queue.wait();
                        }
                        queue.add(value);
                        System.out.println("Producer added new item: " + value);
                        queue.notify();


                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }
}
