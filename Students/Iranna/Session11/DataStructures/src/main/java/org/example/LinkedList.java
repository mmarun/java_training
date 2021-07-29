package org.example;


import java.lang.*;


class LinkedList
{
    Node head;  // head of list

    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    /*  Inserts a
    new Node at front of the list. */
    public void push(int new_data)
    {
	/* 1 & 2: Allocate the Node &
			Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }


    /* This function prints contents of linked list starting from
        the given node */
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }


    // function to insert node at the
    // middle of the linked list
    public void insertAtMid(int x)
    {
        // if list is empty
        if (head == null)
            head = new Node(x);
        else {
            // get a new node
            Node newNode = new Node(x);

            Node ptr = head;
            int len = 0;

            // calculate length of the linked list
            //, i.e, the number of nodes
            while (ptr != null) {
                len++;
                ptr = ptr.next;
            }

            // 'count' the number of nodes after which
            // the new node is to be inserted
            int count = ((len % 2) == 0) ? (len / 2) :
                    (len + 1) / 2;
            ptr = head;

            // 'ptr' points to the node after which
            // the new node is to be inserted
            while (count-- > 1)
                ptr = ptr.next;

            // insert the 'newNode' and adjust
            // the required links
            newNode.next = ptr.next;
            ptr.next = newNode;
        }
    }

}