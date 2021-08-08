package com.javaTutorials.threading;

import lombok.AllArgsConstructor;

import java.util.Queue;
import java.util.Random;

@AllArgsConstructor
public class Producer implements Runnable{
    private Queue<Integer> queue;
    private int capacity;


    @Override
    public void run() {
        while(true){
            synchronized (queue){

                Random random = new Random();
                Integer item = random.nextInt(100);


                try {
                    Thread.sleep(400);
                    while (queue.size() == capacity) {
                        System.out.println("Capacity full producer went into waiting state " + queue.size());
                        queue.wait();
                    }
                    System.out.println("Item added on the queue - " + item);
                    queue.add(item);
                    queue.notifyAll();
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
