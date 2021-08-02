package org.javaTutorials;

public class LinkedList<T> implements List<T>{

   static class Node<T>{
        public T data;
        public Node<T> next;

        //Constructor
       public  Node(T a){
            data=a;
            next=null;
        }
    }
    Node head=null;
    int size;

    /**
     * method to insert data at the beginning
     * @param data
     */

    public void insertFirst(T data){
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
        size++;
    }
    /**
     * Method to insert a new node to the List
     * @param data
     */
    public void insertList(T data){

        Node new_node=new Node<T>(data);
        new_node.next=null;

        //If list is empty then add the data as first element
        if(head==null){
            head=new_node;
        }
        else{
            //goto the last element
            Node last=head;
            while(last.next!=null)
            {
            last=last.next;
            }
            //insert data at the last
            last.next=new_node;
        }
        size++;
        //System.out.println("Size of the List : " + size);
    }

    /**
     * Inserting at the middle of the list
    * @param data
     */
    public void insertMiddle(T data){
        Node<T> new_node=new Node<T>(data);
        new_node.next=null;

        //If list is empty then add the data as first element
        if(head==null){
            head=new_node;
        }
        else{
            Node temp_node=head;
            Node current_node=null;

            // find out the middle of the list
            int mid=(size%2==0)?(size/2):((size+1)/2);

            //traverse through nodes to middle
            for(int i=0;i<mid;i++){
                current_node=temp_node;
                temp_node=temp_node.next;
            }
            current_node.next=new_node;
            new_node.next=temp_node;
        }
        size++;
    }

    public Object getByIndex(int index){
        Node node=head;
        for (int i=0;i<index;i++){
            if(head==null)
                throw new RuntimeException("List is Empty");
            node=node.next;
        }
        return node.data;
    }
    /**
     * Printing the current list
     * @param list
     */
    public void printList(LinkedList list){
        Node thisNode=list.head;
        System.out.println("LinkedList of " + size+ " Elements :  " );
        while(thisNode!=null){
            System.out.println(thisNode.data +" ");
            thisNode=thisNode.next;
        }


    }


}
