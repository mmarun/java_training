package org.example;


public class DaemonDemo extends Thread
{
  public void run() {
      if (Thread.currentThread().isDaemon()) {
          System.out.println("daemon thread");
      } else {
          System.out.println("not a daemon thread");
      }
  }

    public static void main(String[] args) {
        System.out.println("main thread");
        DaemonDemo t = new DaemonDemo();
        t.setDaemon(true);
        t.start();
    }
}


