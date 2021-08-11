package com.threadSync;

import lombok.*;
@AllArgsConstructor
@Getter
@Setter
public class Printing {
    public void print(String fileName) {

        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                try {

                    System.out.println(String.format("%s - Printing page %d object is - %s  Thread Name is -%s",
                            fileName, i, this.toString(), Thread.currentThread().getName()));
                    Thread.sleep(1000);


                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
