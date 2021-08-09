package com.javaTutorials;

import com.javaTutorials.interfaces.Flyable;
import com.javaTutorials.interfaces.Learnable;

import java.util.LinkedList;
import java.util.Queue;

public class AppMain extends Object {


    //Java 8 additional features
    //Enhancements in interface...

    //Before Java 7 you were not allowed to have function definations in your interface.
    //all functions were abstract..

    //With java you can have default and static implementation..
    // default - similar to abstract you can provide a defination and it is upto implementing class s

    public static void main(String[] args){
        Learnable student = new Student();

        System.out.println(student.getInfo());
        student.learn();

        System.out.println(Learnable.add(2, 3));



        Runnable myRunnable2 = () -> {
            try {
                for (int i = 3; i > 0; i--) {
                    Thread.sleep(1000);
                    System.out.println(i);
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        };

        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                try{
                    for(int i = 3; i > 0; i--) {
                        Thread.sleep(1000);
                        System.out.println(i);
                    }
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        };

        Flyable myFlyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("fly");
            }

            @Override
            public void getRequirements() {
                System.out.println("wings");
            }
        };

        Student myStudent = new Student(){
            @Override
            public void learn(){
                System.out.println("Anonymous class invoking learn..");
            }
        };
        System.out.println(myStudent.getClass().getName());

        myFlyable.fly();
        myFlyable.getRequirements();

        //Any interface which has a single abstract method is a functional interface..


        //Functional interface we can gt rid of few things..


        //Lambda expressions take a functional interface..
        //You can miss out on new keyword..
        //You can miss out on the parenthesis.
        //you dont need to provide name of the function




        System.out.println(myRunnable.getClass());
        Thread thread = new Thread(myRunnable2);
        thread.start();
    }
}
