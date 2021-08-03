package org.demo;

public interface QueueInterface<T> {
    public void add(T data);
    public void delete();
    public T get();
    public void printList();
}
