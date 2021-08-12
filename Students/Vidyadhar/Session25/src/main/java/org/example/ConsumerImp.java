package org.example;

import java.util.function.Consumer;

public class ConsumerImp<T> implements Consumer<T> {

   static void printMsg(String name)
   {
       System.out.println("Hello "+name);
   }

   static void getSquare(Integer a)
   {
       System.out.println("Square of given "+a +" is : "+a*a);
   }


    @Override
    public void accept(T t) {

    }
}
