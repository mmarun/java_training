package org.example;

import lombok.*;

import java.util.Queue;

@AllArgsConstructor
public class Customer implements Runnable{
    Queue<Integer> queue;
    private int capacity;

    @Override
    public void run() {
        while(true){
            synchronized (queue){
                try {
                    Thread.sleep(1500);
                    while (queue.size() == 0) {
                        System.out.println("consumed All Items.. Waiting For Producer to produce new Items.." +
                                Thread.currentThread().getName() + " " + queue.size());
                        queue.wait();
                    }
                    Integer item = queue.remove();
                    System.out.println("Item consumed by Customer is : " + item + " from " + Thread.currentThread().getName());

                    queue.notifyAll();
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
