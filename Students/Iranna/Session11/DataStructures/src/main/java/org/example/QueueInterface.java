package org.example;

public interface QueueInterface<T> {
    public void enqueue(T data);
    public void dequeue();
    public boolean isFull();
    public boolean isEmpty();
    public void printQueue();
    public T get();
}
