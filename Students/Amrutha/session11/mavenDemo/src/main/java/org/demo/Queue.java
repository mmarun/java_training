package org.demo;

public class Queue<T> implements QueueInterface<T>{
    T arrayElements[];
    int arraySize;
    int front=0;
    int rear=-1;

    public Queue(int arraySize) {
        arrayElements = (T[])new Object[arraySize];
        this.arraySize=arraySize;
    }

    @Override
    public void add(T data) {
        if(front==arraySize-1){
            System.out.println("Queue is Full---");
        }
        else
        {
            arrayElements[++rear]=data;

        }

    }

    @Override
    public void delete() {
        if(front==-1 && rear==-1)
        {
            System.out.println("Empty list");

        }
        else
        {
            System.out.println("Deletd element"+ arrayElements[front]);
            front++;
        }
    }

    @Override
    public T get() {
        if(front==-1 || rear==-1)
        {
            System.out.println("Empty list");
            System.exit(0);

        }
        return arrayElements[front];

    }

    @Override
    public void printList() {
        if(front==-1||rear==-1){
            System.out.println("Queue is Empty");
        }
        else
        {
        System.out.println("Queue Elements are ");
        for(int i=front;i<=rear;i++) {
            System.out.println(arrayElements[i]);
        }
        }
    }
}
