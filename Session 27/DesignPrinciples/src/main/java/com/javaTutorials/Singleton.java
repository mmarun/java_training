package com.javaTutorials;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {

    }

    /**
     * Return instance of the singleton object
     * @return Singleton
     */
    public static Singleton getSingleton(){
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    /**
     * Gives the free memory available for the application
     */
    public void printFreeMemory(){
        System.out.println(" Printing free memory " + Runtime.getRuntime().freeMemory());
    }
}
