package org.example.AutocloseableInterface;

public class MyResource implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Autocloseable Resource");
    }
}
