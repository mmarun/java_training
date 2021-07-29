package org.example;

public class Queue {

    Integer queueArr[] = new Integer[5];
    int rear;
    int front;
    int size;

    public void insert(int data)
    {
        queueArr[rear]=data;
        rear++;
        size++;
    }


    public int remove()
    {
        int data=queueArr[front];
        queueArr[front]=0;
        front++;
        size--;
        return data;
    }

    public void Display()
    {
        System.out.println("The Queue Elements: ");

        for(int i=0;i<size;i++)
        {
            System.out.print(queueArr[front+i]+" ");
        }
    }
}
