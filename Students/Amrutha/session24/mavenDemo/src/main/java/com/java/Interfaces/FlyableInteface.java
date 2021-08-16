package com.java.Interfaces;

public interface FlyableInteface {
   default void fly()
   {
       System.out.println("This is default impl");
   }
    void printFly();
}
