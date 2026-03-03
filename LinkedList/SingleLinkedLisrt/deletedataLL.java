import java.util.*;
class Node 
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class ll
{
    Node head;
    ll()
    {
        head=null;
    }
    void insert(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }
    void delete(int key)
    {
        if(head==null)
        {
            System.out.println("Linkelist is empty");
            return;
        }
        if(head.data==key)
        {
            head=head.next;
            return;
        }
        Node temp=head;
        while(temp.next!=null&&temp.next.data!=key)
        {
            temp=temp.next;
        }
        if(temp.next!=null)
        {
            temp.next=temp.next.next;
        }

    }
    void display()
    {
        if(head==null)
        {
            System.out.println("Linkedlist is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

}


public class deletedataLL 
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        ll l=new ll();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            l.insert(sc.nextInt());

        }
        int key=sc.nextInt();
        l.delete(key);
        l.display();
     }    
}
