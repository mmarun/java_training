package org.example;

import javafx.stage.StageStyle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Stack stackArray = new Stack();

      stackArray.push(100);
      stackArray.push(200);
      stackArray.push(300);
      stackArray.push(400);
      stackArray.push(500);

      System.out.println(stackArray.peek());
      stackArray.show();

      System.out.println(stackArray.pop());
      System.out.println(stackArray.peek());




      System.out.println("Linked list operations............................................");

      LinkedList list=new LinkedList();

      list.insert(100);
      list.insert(200);
      list.insert(300);
      list.insert(400);
      list.insertAtStart(800);
      list.insertAt(2,900);
      list.show();
      list.deleteAt(1);

      list.show();
      System.out.println("The List Element At given position");
      System.out.println(list.showAt(0));

      System.out.println("The Queue operations............................................");

      Queue queue = new Queue();

      queue.insert(25);
      queue.insert(50);
      queue.insert(75);
      queue.insert(100);
      queue.Display();

      System.out.println("queue last element or Rearend element "+queue.peekLast());
      System.out.println("Head element of the queue :"+queue.peek());
      System.out.println("Removed element of the queue :"+queue.remove());
      System.out.println("Removed element of the queue :"+queue.remove());

      queue.insert(999);
      queue.Display();
      System.out.println("Head element of the queue :"+queue.peek());

      System.out.println(queue.len);
      System.out.println("queue last element or Rearend element "+queue.peekLast());


    }
}
