package org.example;

public class Stack<T> implements StackInterface<T> {
    int size;
    T arr[];
    int top;

    public Stack(int size) {
        this.size = size;
        this.arr = (T[])new Object[size];
        this.top = -1;
    }
    @Override
    public void push(T pushedElement) {
        if (!isFull()) {
            top++;
            arr[top] = pushedElement;
            System.out.println("Pushed element:" + pushedElement);
        } else {
            System.out.println("Stack is full !");
        }

    }

    @Override
    public void pop() {
        if (!isEmpty()) {
            int returnedTop = top;
            top--;
            System.out.println("Popped element :" + arr[returnedTop]);

        } else {
            System.out.println("Stack is empty !");

        }
    }

    @Override
    public Object peek() {
        if (!this.isEmpty())
            return arr[top];
        else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (size - 1 == top);
    }

    @Override
    public void printStack(){
        System.out.println("stack elements are");
        for(int i =top; i>=0;i--)
            System.out.println(arr[i]);
    }


}