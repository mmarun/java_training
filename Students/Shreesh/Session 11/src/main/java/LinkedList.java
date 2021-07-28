public class LinkedList
{
    Node head;
    public void insert(int data) 
    {
        Node node=new Node();
        node.data=data;
        node.next=null; 
        
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }

    public void show()
    {
        Node node=head;
        while(node.next!=null)
        {
            System.out.print(node.data +" ");
            node=node.next; 
        }
        System.out.print(node.data);
        System.out.println();
    }

    public void insertAtStart(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        node.next=head;
        head=node;
    }

    public void insertAt(int index,int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(index==0)
        {
            insertAtStart(data);
        }
        Node n=head;
        for(int i=0;i<index-1;i++)
        {
            n=n.next;
        }
        node.next=n.next;
        n.next=node;
    }

    public void deleteAt(int index)
    {
        Node n=head;
        Node n1=new Node();
        if(index==0)
        {
            head=head.next;
        }
        for(int i=0;i<index-1;i++)
        {
            n=n.next;
        }
        n1= n.next;
        n.next=n1.next;
        System.out.println("Deleted Value is : " +n1.data);
        n1=null;
    }
}