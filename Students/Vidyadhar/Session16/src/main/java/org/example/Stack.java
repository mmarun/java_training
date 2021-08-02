package org.example;

public class Stack {

    Integer stack[] = new Integer[5];
    int top=0;
   int size= stack.length;
    public void push(int value)
    {
        if(top==size)
        {
            System.out.println("Stack Overflow condition");
        }
        else
        {
            stack[top] = value;
            top++;
        }
    }

    public int pop()
    {
        if(top<=0)
        {
            System.out.println("stack underflow condition");
        }
        top--;
        int data = stack[top];
        stack[top]=0;
        return data;

    }

    public int peek()
    {
        int data = stack[top-1];
        return data;
    }

    public void show()
    {
        for (Integer elememt : stack)
        {
            System.out.print(elememt+" ");
        }
        System.out.println();
    }


}
