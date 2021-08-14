package org.demo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PrintTask implements Runnable{

    private String fileName;
    private Printer printDetail;

    public void print()
    {
        printDetail.print(fileName);
    }
    @Override
    public void run() {
       print();
    }
}
