import java.util.*;
class Queue
{
    int []arr;
    int size;
    int front;
    int rear;
    Queue(int size)
    {
        this.size=size;
        this.front=-1;
        this.rear=-1;
        arr=new int[size];
    }
    boolean isfull()
    {
        return (front==0&&rear==size-1)||(front==rear+1);
    }
    boolean isempty()
    {
        return front==-1;
    }
    void insertfront(int data)
    {
        if(isfull())
        {
            System.out.println("Deque is full");
            return;
        }
        if(front==-1)
        {
            front=rear=0;
        }
        else if(front==0)
        {
            front=size-1;
        }
        else
        {
            front--;
        }
        arr[front]=data;
    }
    void insertrear(int data)
    {
        if(isfull())
        {
            System.out.println("Deque is full");
            return;
        }
        if(front==-1)
        {
            front=rear=0;
        }
        else if(rear==size-1)
        {
            rear=0;
        }
        else
        {
            rear++;
        }
        arr[rear]=data;
    }
    void deletefront()
    {
        if(isempty())
        {
            System.out.println("Deque is empty");
            return;
        }
        System.out.println(arr[front]+" ");
        if(front==rear)
        {
           front=rear=-1;
        }
        else if(front==size-1)
        {
            front=0;
        }
        else
        {
            front++;
        }
    }
    void deleterear()
    {
        if(isempty())
        {
            System.out.println("Deque is emppty");
            return;
        }
        System.out.println(arr[rear]+" ");
        if(front==rear)
        {
            front=rear=-1;
        }
        else if(rear==0)
        {
            rear=size-1;
        }
        else
        {
            rear--;
        }
    }
    void display()
    {

    
       if(isempty())
        {
             System.out.println("Deque is empty");
             return;
        }
      int i = front;

        while (true) 
        {
            System.out.print(arr[i] + " ");
            if (i == rear)
                break;
              i = (i + 1) % size;
        }


    }
}
public class DoubleEndedDeque 
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Queue q=new Queue(size);
        while(true)
        {
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    int data=sc.nextInt();
                    q.insertfront(data);
                    break;
                case 2:
                    int Data=sc.nextInt();
                    q.insertrear(Data);
                    break;
                case 3:
                    q.deletefront();
                    break;
                case 4:
                    q.deleterear();
                    break;
                case 5:
                    q.display();
                    break;
                default:
                    System.out.println("Exiting");
                    sc.close();
                     

            }
        }
         

     }    
}
