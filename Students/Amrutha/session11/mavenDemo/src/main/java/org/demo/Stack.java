package org.demo;

public class Stack<T> implements StackInterface<T> {
 T arrayElements[];
 int arraySize;
 int top;

 public Stack(int arraySize) {
  arrayElements = (T[])new Object[arraySize];
  this.arraySize=arraySize;
  top=-1;
 }

 @Override
 public void push(T data) {
 if(top==arraySize-1)
 {
  System.out.println("Stack overflow");
 }
 else
 {
  arrayElements[++top]=data;
 }
 }

 @Override
 public void pop() {
  if(top==-1) {
   System.out.println("No elements");
  }
  else
  {
   System.out.println("Poped Element"+arrayElements[top]);
   top--;
  }
 }

 @Override
 public T peek() {
  return arrayElements[top];
 }

 @Override
 public void printList() {
  if(top==-1)
  {
   System.out.println("Empty List");
  }
  else
  {
   for(int i=top;top>=0;top--)
   {
    System.out.println(arrayElements[top]);
   }
  }
 }
}

