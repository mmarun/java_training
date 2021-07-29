package org.javaTutorials;

public class Stack{

    private int arr_elements[];
    public int top;
    public int stack_size;

    //Constructor
    Stack(int size){
        arr_elements =new int[size];
        stack_size=size;
        top=-1;
    }
/**
 * Pushing an element to stack
 */
    public void push(int a){
        if(top==stack_size-1){
            System.out.println("Stack Overflow---");
            System.exit(1);
        }
        System.out.println("Inserting... "+a);
        arr_elements[++top]=a;
    }

    public void pop(){
        if(top==-1){
            System.out.println("Stack Underflow------");
            System.exit(1);
        }
        System.out.println("Pop the top element  " + arr_elements[top]);
        top--;
    }
    /**
     * printing elements in the stack in form of stack (last element @the top)
     * @param stack
     */
    public void printStack(Stack stack){

        if(top==-1) {
            System.out.println("Stack is Null");
            System.exit(1);
        }
        System.out.println("Stack Elements----");
        for(int i=top;i>=0;i--){
            System.out.println(arr_elements[i]);
        }
    }
}
