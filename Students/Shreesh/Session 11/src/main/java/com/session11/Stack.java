package com.session11;

public class Stack
{
    int[] stack =new int[5];
    int top=0;
    public void push(int data)
    {
        if(top==5)
        {
            System.out.println("com.session11.Stack is Full");
        }
        else
        {
            stack[top] = data;
            top++;
        }

    }
    public int pop()
    {
        int data=0;
        if(isEmpty())
        {
            System.out.println("com.session11.Stack is Empty!!");
        }
        else {
            top--;
            data = stack[top];
            stack[top] = 0;
        }
        return data;
    }
    public void show()
    {
        for(int n :stack)
        {
            System.out.print(n +" ");
        }
        System.out.println();
    }
    public int peek()
    {
        int peekTop=top;
        int data;
        data=stack[peekTop--];
        return data;
    }
    public int size()
    {
        return top;
    }
    public boolean isEmpty()
    {
        return top<=0;
    }

    public int valueAt(int index)
    {
        int val=0;
        for(int n=0;n<=index-1;n++)
        {
            if (n==index-1)
            {
                val=stack[n];
            }
        }
        return val;
    }
}
