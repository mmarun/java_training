package org.example;

public interface StackInterface<T> {
    public void push(T pushedElement);
    public void pop();
    public Object peek();
    public boolean isEmpty();
    public boolean isFull();
    public void printStack();
}
