package org.example.Threadingprogram;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@AllArgsConstructor
@Getter
public class Printer implements Runnable{

   public void print(String Filename) throws InterruptedException {

       synchronized (this) {
           for (int i = 0; i < 5; i++) {
               System.out.println(String.format("%s - printing  %d pages Threadname : %s", Filename, i, Thread.currentThread().getName()));

               Thread.sleep(2000);
           }
       }
   }
    @Override
    public void run() {

    }
}
