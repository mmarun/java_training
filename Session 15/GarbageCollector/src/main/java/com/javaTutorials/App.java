package com.javaTutorials;

public class App
{
    public static void main( String[] args )
    {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());

        for (int i = 1000000; i  > 0; i--) {
            Car car = new Car("Fiat", "Palio", 700000.00);
            car = null;
        }
        runtime.gc();

        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());

    }
}

