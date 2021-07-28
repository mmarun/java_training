package org.javaTutorials;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // creating & calling Linked List methods
        LinkedList list=new LinkedList();


        //inserting Elements to list
        list.insertList(1);
        list.insertList(3);
        list.insertList(5);

        list.insertFirst(9);
        list.insertMiddle(8);

        //Printing Elements in the list
        list.printList(list);


        //creating and calling Stack Methods
        Stack stack=new Stack(5);

        stack.push(6);
        stack.push(3);
        stack.push(4);
        stack.push(7);
        stack.push(8);

        // printing stack elements before pop method
        stack.printStack(stack);

        stack.pop();
        stack.pop();
        stack.pop();


        //printing stack elements after pop method
        stack.printStack(stack);

        //creating & calling Queue methods
        Queue queue=new Queue(5);

        queue.add_Queue(1);
        queue.add_Queue(2);
        queue.add_Queue(3);
        queue.add_Queue(4);
        queue.add_Queue(5);


        queue.printQueue(queue);

        queue.remove_Queue();
        queue.remove_Queue();
        queue.remove_Queue();


        queue.printQueue(queue);


    }
}
