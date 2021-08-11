package org.example.Threadingprogram;

import lombok.AllArgsConstructor;

import java.util.Queue;
import java.util.Random;

@AllArgsConstructor
public class Producer implements Runnable {

    private Queue<Integer> queue;
    private int capacity;

    @Override
    public void run() {

      while (true)
      {
          synchronized (queue)
          {
              Random random = new Random();
              Integer item = random.nextInt(100);

              try {
                  Thread.sleep(500);
                  while (queue.size()==capacity)
                  {
                      System.out.println("Producer queue is Full producer has to wait : "+queue.size());
                      queue.wait();
                  }
                  System.out.println("item added to the Producer queue : "+item +" "+Thread.currentThread().getName());
                  queue.add(item);
                  queue.notifyAll();

              }
              catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
      }

    }
}
