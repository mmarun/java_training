package org.javaTutorials.MultiThreading;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Printer {

    public synchronized void print(String fileName) {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(String.format(fileName));
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }
    }
}
