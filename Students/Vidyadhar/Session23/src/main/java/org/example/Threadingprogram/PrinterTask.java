package org.example.Threadingprogram;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

@AllArgsConstructor
@Getter
@Setter
public class PrinterTask implements Runnable{

    private String fileName;
    private Printer printDetels;

    public void print() throws InterruptedException {
        printDetels.print(fileName);
    }

    @SneakyThrows
    @Override
    public void run() {
        this.print();
    }
}
