package com.session11;

public class Queue
{
    int[] queue=new int[4];
    int size;
    int front;
    int rear;

    public void enQueue(int data)
    {
        queue[rear]=data;
        rear++;
        size++;
    }

    public int deQueue()
    {
        int data=queue[front];
        queue[front]=0;
        front++;
        size--;
        return data;
    }

    public void show()
    {
        System.out.println("Elements of com.session11.Queue");
        for(int i=0;i<size;i++)
        {
            System.out.print(queue[front+i]+ " ");
        }
    }

    public int valueAt(int index)
    {
        return queue[index-1];
    }

    public int sizeOf()
    {
        return size;
    }

}
