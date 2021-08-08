package com.javaTutorials.threading;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Printer {

    public void print(String fileName) {

        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                try {

                    System.out.println(String.format("%s - Printing page %d Printer object - %s  Thread Name -%s",
                            fileName, i, this.toString(), Thread.currentThread().getName()));
                    Thread.sleep(2000);


                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
