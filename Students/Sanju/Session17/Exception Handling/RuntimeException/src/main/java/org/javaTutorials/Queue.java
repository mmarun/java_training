package org.javaTutorials;

public class Queue<S> {
    public String arr_elements[];
    private int head;
    public int tail;
    public int capacity;

    Queue(int size){
        arr_elements=new String[size];
        capacity=size;
        head=0;
        tail=-1;
    }

    /**
     * Adding Elements to Queue
     * @param a
     */
    public void add_Queue(String a){
        if(tail==capacity-1){
            System.out.println("Queue is Full---");
            System.exit(1);
        }
        System.out.println(" Adding  "+ a +"  to Queue");
        arr_elements[++tail]=a;
    }

    /**
     * Removing element from the queue
     */
    public void remove_Queue(){

       try {
           if (tail == head - 1) {
               System.out.println("Queue is Null; Cannot Remove");
               //System.exit(1);
           }
           System.out.println("Deleting --- " +arr_elements[head]);

           head++;
       }catch (IndexOutOfBoundsException ex) {
           System.out.println( "Thrown Exception");
       }


    }
    /**
     * Printing Queue Elements
     * @param queue
     */
    public void printQueue(Queue<String> queue) {

        try {
            if (tail == -1 || tail == head - 1) {
                System.out.println("Printing Elements----Queue is Empty");
                // System.exit(1);
            }
           // System.out.println("Queue Elements are ");
            for (int i = head; i <= tail; i++) {
                System.out.println(arr_elements[i]);
            }

        } catch (NullPointerException ex) {
            //System.out.println("Printing::Queue is Empty");

            }

        }

}
