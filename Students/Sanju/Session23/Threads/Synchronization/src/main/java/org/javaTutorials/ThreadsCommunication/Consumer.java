package org.javaTutorials.ThreadsCommunication;

import lombok.AllArgsConstructor;

import java.util.Queue;

@AllArgsConstructor
public class Consumer implements Runnable{

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
    while(true){
        synchronized (queue) {
            try {
                Thread.sleep(2000);
                while (queue.size() == 0) {
                    System.out.println("Queue is Empty-- Consumer waiting---" + queue.size());
                    queue.wait();
                }
                Integer item = queue.remove();
                System.out.println("Item removed from the Queue" + item);
                queue.notify();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }
    }
}
