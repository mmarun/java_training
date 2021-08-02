package org.example;

public class Queue<T> implements QueueInterface<T>{

    private int capacity;
    T queueArr[];
    int front;
    int rear;
    int currentSize = 0;

    public Queue(int sizeOfQueue) {
        this.capacity = sizeOfQueue;
        front = 0;
        rear = -1;
        queueArr = (T[])new Object[currentSize];
    }

    /**
     * this method is used to add element in the queue
     *
     * @param data
     */
    @Override
    public void enqueue(T data) {
        if (isFull()) {
            System.out.println("Queue is full!! Can not add more elements");
        } else {
            rear++;
            if (rear == capacity - 1) {
                rear = 0;
            }
            queueArr[rear] = data;
            currentSize++;
            System.out.println(data + " added to the queue");
        }
    }

    /**
     * This method removes an element from the front of the queue
     */
    @Override
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!! Can not dequeue element");
        } else {
            front++;
            if (front == capacity - 1) {
                System.out.println(queueArr[front - 1] + " removed from the queue");
                front = 0;
            } else {
                System.out.println(queueArr[front - 1] + " removed from the queue");
            }
            currentSize--;
        }
    }



    @Override
    public T get() {
        if(isEmpty())
        {
            System.out.println("Empty queue");
            System.exit(0);

        }
        return queueArr[front];

    }

    /**
     * This method is use to check if element is full or not
     *
     * @return boolean
     */
    @Override
    public boolean isFull() {
        if (currentSize == capacity) {
            return true;
        }
        return false;
    }

    /**
     * This method is use to check if element is empty or not
     *
     * @return
     */
    @Override
    public boolean isEmpty() {

        if (currentSize == 0) {
            return true;
        }
        return false;
    }


    @Override
      public void printQueue(){
        if(isEmpty())
        {
            System.out.println("queue is empty");
        }
        else
        {
            System.out.println("queue elements");
            for(int i=front; i<=rear ; i++){
                System.out.println(queueArr[i]);
            }
        }
   }
}