package com.javaTutorials.threading;

import lombok.AllArgsConstructor;

import java.util.Queue;

@AllArgsConstructor
public class Consumer implements Runnable{
    Queue<Integer> queue;
    private int capacity;

    @Override
    public void run() {
        while(true){
            synchronized (queue){
                try {
                    Thread.sleep(1000);
                    while (queue.size() == 0) {
                        System.out.println("Queue is empty, Consumer is in waiting state " +
                                Thread.currentThread().getName() + " " + queue.size());
                        queue.wait();
                    }
                    Integer item = queue.remove();
                    System.out.println("Item removed from the queue - " + item + " " + Thread.currentThread().getName());

                    queue.notifyAll();
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
