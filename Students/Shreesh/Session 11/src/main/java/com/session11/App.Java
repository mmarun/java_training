package com.session11;

class App
{
    public static void main(String[] args)
    {
      System.out.println("Now Showing com.session11.LinkedList");

      LinkedList list=new LinkedList();
      list.insert(5);
      list.insert(16);
      list.insert(8);
      list.insert(2);
      list.insert(13);
      list.insertAtStart(35);
      list.insertAt(2,95);
      list.show();
      list.deleteAt(3);
      list.show();

      System.out.println("Now Showing com.session11.Stack");

      Stack nums=new Stack();
      System.out.println("com.session11.Stack Is Empty : "+nums.isEmpty());
      nums.push(75);
      nums.show();
      nums.push(69);
      nums.show();
      nums.push(82);
      nums.show();
      nums.push(15);
      nums.show();
      nums.push(91);
      nums.show();
      nums.push(152);
      nums.show();
      System.out.println(nums.pop()+ " Removed From com.session11.Stack");
      System.out.println(nums.pop()+ " Removed From com.session11.Stack");
      System.out.println(nums.pop()+ " Removed From com.session11.Stack");
      System.out.println(nums.peek()+ " Peek From com.session11.Stack");
      nums.show();
      System.out.println(nums.size() +" is size of com.session11.Stack");
      System.out.println("com.session11.Stack Is Empty : "+nums.isEmpty());

      System.out.println("Now Showing com.session11.Queue");
      Queue q=new Queue();
      q.enQueue(65);
      q.enQueue(31);
      q.enQueue(28);
      q.enQueue(73);
      q.show();
      q.deQueue();q.deQueue();q.deQueue();
      q.show();
    }
}