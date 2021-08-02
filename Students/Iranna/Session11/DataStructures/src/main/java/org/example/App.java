package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Stack StackCustom = new Stack(10);
        StackCustom.pop();
        System.out.println("=================");
        StackCustom.push(10);
        StackCustom.push(30);
        StackCustom.push(50);
        StackCustom.push(40);
        StackCustom.push(50);
        StackCustom.printStack();

        System.out.println("=================");
        StackCustom.pop();
        StackCustom.pop();
        StackCustom.pop();
        StackCustom.printStack();
        System.out.println("=================");

        System.out.println("Now linked list");
        LinkedList llist = new LinkedList();
        llist.navigate();
        llist.addTail(15);
        llist.addTail(24);
        llist.addTail(45);
        llist.addStart(22);
        llist.addMiddle(99,3);


        System.out.println("now queue");
        Queue queue = new Queue(10);
        queue.enqueue(32);
        queue.enqueue(232);
        queue.enqueue(38);
        queue.enqueue(132);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
