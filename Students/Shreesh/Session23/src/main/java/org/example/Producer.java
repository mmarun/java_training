package org.example;

import lombok.*;

import java.util.Queue;
import java.util.Random;

@AllArgsConstructor
public class Producer implements Runnable {
    private Queue<Integer> queue;
    private int capacity;


    @Override
    public void run() {
        while(true){
            synchronized (queue){
                Random random = new Random();
                Integer randomInput = random.nextInt(100);
                try {
                    Thread.sleep(1000);
                    while (queue.size() == capacity) {
                        System.out.println("Production Done ..Waiting For Customer to Consume..." + queue.size());
                        queue.wait();
                    }
                    System.out.println("New Item Produced by Producer : " + randomInput);
                    queue.add(randomInput);
                    queue.notifyAll();
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
