package org.example;



import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class LinkedList<T> implements List<T> {

    private Node head = null;

    class Node<T> {
        public Node(T data){
            this.data = data;
            this.next = null;
        }
        public T data;
        public Node<T> next;
    }

    @Override
    public void addTail(T element) {

        Node trav = head;
        //list:
        if (head == null){
            trav = new Node(element);
            head = trav;
            return;
        }

        // list: 1
        while(trav.next != null){
            trav = trav.next;
        }
        trav.next = new Node(element);
        return;
    }

    @Override
    public void navigate() {
        throw new NotImplementedException();
    }

    @Override
    public void addStart(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public void addMiddle(T element,int index) {
        Node<T> trav = head;
        for (int position = 1; position < index - 1; position++){
            if (trav == null)
                throw new RuntimeException("Position is not present");
            trav = trav.next;
        }
        Node<T> newNode = new Node<>(element);
        newNode.next = trav.next;//3
        trav.next = newNode;
        //list : 1 -> 2 -> 3
        //list : 1 -> 2 -> 5 -> 3
    }

    @Override
    public T getByIndex(int index) {
        Node<T> trav = head;
        for (int position = 1; position < index; position++){
            if (trav == null)
                throw new RuntimeException("Position is not present");
            trav = trav.next;
        }
        return  trav.data;
    }
}
