package org.javaTutorials;

public class Queue {
    private int arr_elements[];
    private int head;
    public int tail;
    public int capacity;

    Queue(int size){
        arr_elements=new int[size];
        capacity=size;
        head=0;
        tail=-1;
    }

    /**
     * Adding Elements to Queue
     * @param a
     */
    public void add_Queue(int a){
        if(tail==capacity-1){
            System.out.println("Queue is Full---");
            System.exit(1);
        }
        System.out.println(" Adding "+a +" to Queue");
        arr_elements[++tail]=a;
    }

    /**
     * Removing element from the queue
     */
    public void remove_Queue(){
        if(tail==head-1){
            System.out.println("Queue is Null");
            System.exit(1);
        }
        System.out.println("Deleting --- " +arr_elements[head]);

        head ++;

    }
    /**
     * Printing Queue Elements
     * @param queue
     */
    public void printQueue(Queue queue){
        if(tail==-1||tail==head-1){
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        System.out.println("Queue Elements are ");
        for(int i=head;i<=tail;i++){
            System.out.println(arr_elements[i]);
        }
    }
}
