package org.example.Threadingprogram;

import lombok.AllArgsConstructor;

import java.util.Queue;

@AllArgsConstructor
public class Consumer implements Runnable{

    private Queue<Integer> queue;
    private int capacity;

    @Override
    public void run() {
      while (true)
      {
          synchronized (queue)
          {
              try {
                  Thread.sleep(2000);

                  while (queue.size()==0)
                  {
                      System.out.println("consumer queue is empty...has to wait : "+queue.size() +" "+Thread.currentThread().getName());
                      queue.wait();
                  }

                  Integer item = queue.remove();
                  System.out.println("item removed from consumer queue : "+item +" "+Thread.currentThread().getName());
                  queue.notifyAll();
              }
              catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
      }

    }
}
