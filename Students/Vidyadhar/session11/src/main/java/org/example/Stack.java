package org.example;

public class Stack {

    Integer stack[] = new Integer[5];
    int top=0;

    public void push( int value)
    {
        if(top==5)
        {
            System.out.println("stack is full overflow condition");
        }
        else
        {
            stack[top]= value;
            top++;
        }
    }

    public String pop()
    {
        int value=0;
        if(top==0)
        {
            return "underfloe condtion No element to delete";
        }
        else
        {
            top--;
            value=stack[top];
            stack[top]=0;
        }
        return "element deleted";
    }

    public void show()
    {
        for(Integer item:stack)
        {
            System.out.print(" "+item);
        }
        System.out.println();
    }
}
