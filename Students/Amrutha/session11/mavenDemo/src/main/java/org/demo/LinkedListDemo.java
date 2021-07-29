package org.demo;

public class LinkedListDemo {
    Node head;
    public void createLinkedList(int value)
    {
        Node newNode=new Node(value);

        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node node=head;
            while(node.getNextNode()!=null)
            {
                node=node.getNextNode();

            }
            node.setNextNode(newNode);
        }
    }
    public void insertBeginning(int value)
    {
        Node newNode =new Node(value);
        newNode.setNextNode(head);
        head=newNode;

    }
    public void insertMiddle(int value)
    {
        Node newNode=new Node(value);
        Node node=head;
        if(node==null)
        {
            System.out.println("Empty list");
            head=newNode;
        }
        else
        {
            int count=0;
            while(node!=null)
            {
                count++;
                node=node.getNextNode();
            }
            int mid=count/2;
            Node currentNode=head;

            int currentPos=0;
            while(currentNode!=null)
            {
                if(currentPos==mid-1)
                {
                    newNode.setNextNode(currentNode.getNextNode());
                    currentNode.setNextNode(newNode);
                    currentNode = newNode;
                }
                currentNode=currentNode.getNextNode();
                currentPos++;
            }
        }

    }
    public void traverseList()
    {
        Node node=head;

            System.out.print("List\n");
            while (node != null) {
                System.out.println(node.getValue() + " ");
                node = node.getNextNode();
            }

    }

}
