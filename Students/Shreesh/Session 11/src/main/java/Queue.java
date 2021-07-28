public class Queue
{
    int[] queue=new int[4];
    int size;
    int front;
    int rear;

    public void enQueue(int data)
    {
        queue[rear]=data;
        rear++;
        size++;
    }

    public int deQueue()
    {
        int data=queue[front];
        queue[front]=0;
        front++;
        size--;
        return data;
    }

    public void show()
    {
        System.out.println("Elements of Queue");
        for(int i=0;i<size;i++)
        {
            System.out.print(queue[front+i]+ " ");
        }
    }

}
