package org.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    LinkedListDemo linkedListDemo=new LinkedListDemo();
    linkedListDemo.createLinkedList(5);
    linkedListDemo.createLinkedList(8);
    linkedListDemo.insertBeginning(1);
    linkedListDemo.insertMiddle(3);
    linkedListDemo.insertMiddle(7);
    linkedListDemo.traverseList();

    }
}
