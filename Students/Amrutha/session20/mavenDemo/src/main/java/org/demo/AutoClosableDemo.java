package org.demo;

import java.io.Closeable;

public class AutoClosableDemo implements Closeable {
    void show() { System.out.println("inside show"); }
    public void close()
    {
        System.out.println("close from demo");
    }
}

// custom resource 2
class Demo1 implements Closeable {
    void show1() { System.out.println("inside show1"); }
    public void close()
    {
        System.out.println("close from demo1");
    }
}