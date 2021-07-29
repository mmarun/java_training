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

        System.out.println("=================");
        StackCustom.pop();
        StackCustom.pop();
        StackCustom.pop();
        System.out.println("=================");

        System.out.println("Now linked list");
        LinkedList llist = new LinkedList();
        llist.push(2);
        llist.push(4);
        llist.push(6);
        llist.printList();

        System.out.println("adding element at start");
         llist.push(8);
        llist.printList();
        System.out.println("adding element at middle of linked list");
        llist.insertAtMid(10);
        llist.printList();

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
