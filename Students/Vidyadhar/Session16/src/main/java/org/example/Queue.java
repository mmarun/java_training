package org.example;

public class Queue {

    Integer queueArray[] = new Integer[5];
    int rear;
    int front;
    int size;
    int len = queueArray.length;

    public void insert(int data)
    {
        queueArray[rear]=data;
        rear++;
        size++;
    }


    public int remove()
    {
        int data= queueArray[front];
        queueArray[front]=0;
        front++;
        size--;
        return data;
    }
    public int peek()
    {
        int data= queueArray[front];
        return data;
    }

    public int peekLast()
    {
        int data= queueArray[rear-1];
        return data;
    }

    public void Display()
    {
        System.out.println("The Queue Elements: ");

        for(int i=0;i<size;i++)
        {
            System.out.print(queueArray[front+i]+" ");
        }
        System.out.println();
    }
}
