package org.example;


/* Creating three threads using the class Thread and then running them concurrently. */
class ThreadA extends Thread{
    public void run( ) {
        for(int i = 1; i <= 5; i++) {
            System.out.println("From Thread A with i = "+ "hi");
        }
        System.out.println("Exiting from Thread A ...");
    }
}

class ThreadB extends Thread {
    public void run( ) {
        for(int j = 1; j <= 5; j++) {
            System.out.println("From Thread B with j= "+ "hello");
        }
        System.out.println("Exiting from Thread B ...");
    }
}
class ThreadC extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("From Thread C with k = " + "good morning");
        }
        System.out.println("Exiting from Thread C ...");
    }


    public static class Thread {
        public static void main(String[] args) {
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            ThreadC c = new ThreadC();
            a.start();
            b.start();
            c.start();
            System.out.println("... Multithreading is over ");
        }
    }
}