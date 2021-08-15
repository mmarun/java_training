package org.javaTutorials;

public class LinkedList {

   static class Node{
        int data;
        Node next;

        //Constructor
        Node(int a){
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

    public void insertFirst(int data){
        Node new_node=new Node(data);
        Node temp;
        temp=head;
        head=new_node;
        head.next=temp;
        size++;
    }
    /**
     * Method to insert a new node to the List
     * @param data
     */
    public void insertList(int data){

        Node new_node=new Node(data);
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
    public void insertMiddle(int data){
        Node new_node=new Node(data);
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
