package org.javaTutorials.ThreadsCommunication;

import lombok.AllArgsConstructor;

import java.util.Queue;
import java.util.Random;

@AllArgsConstructor
public class Producer implements  Runnable{

    private Queue<Integer> queue;
    private int capacity;
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        while (true) {
            Random random = new Random();
            Integer item = random.nextInt(100);
            synchronized (queue) {
                try {
                    Thread.sleep(1000);
                    while (queue.size() == capacity) {
                        System.out.println("Capacity full for Producer Queue-- Wait" + queue.size());
                        queue.wait();
                    }
                    System.out.println("Item added to Queue" + item);
                    queue.add(item);
                    queue.notify();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
