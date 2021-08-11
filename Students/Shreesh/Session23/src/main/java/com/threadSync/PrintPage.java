package com.threadSync;

import  lombok.*;
@AllArgsConstructor
@Getter
@Setter

public class PrintPage implements Runnable{
    private String fileName;
    private Printing filePrinting;

    public void print(){
        filePrinting.print(fileName);
    }

    @Override
    public void run() {
        this.print();
    }
}
