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
      Stack StkArr = new Stack();

      System.out.println("Stack Operations..................................");
      // Adding elements to stack using push()
      StkArr.push(100);
      StkArr.show();

      StkArr.push(200);
      StkArr.push(300);
      StkArr.push(400);
      StkArr.push(500);
      StkArr.show();

//Overflow condition of stack;
      StkArr.push(600);

//Deleteing element from the stack using pop()
        System.out.println(StkArr.pop());
        StkArr.show();

        System.out.println(StkArr.pop());
        StkArr.pop();
        StkArr.show();

        //Underflow condtion
      System.out.println(StkArr.pop());
      System.out.println(StkArr.pop());
      System.out.println(StkArr.pop());

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

      System.out.println("The Queue operations............................................");

      Queue queue = new Queue();

      queue.insert(25);
      queue.insert(50);
      queue.insert(75);
      queue.insert(100);
      queue.insert(125);
      queue.Display();

      queue.remove();
      queue.remove();
      queue.Display();

    }
}
