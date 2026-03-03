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
class LL
{
    Node head=null;
    void insertAtend(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            
        }
        temp.next=newNode;
    }
    void deleteKth(int n)
    {
       if(head==null)
       {
        System.out.println("Linkedlist is empty");
        return;
       }
       Node fast=head;
       for(int i=0;i<n-1;i++)
       {
        fast=fast.next;
       }
       fast.next=fast.next.next;
        
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

public class deleteKthNode 
{
  public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LL ll=new LL();
        int val;
        do
        {
            
         val=sc.nextInt();
         if(val!=-1)
         {
         ll.insertAtend(val);
         }
        }while(val!=-1);
        int n=sc.nextInt();
        ll.deleteKth(n);
        ll.display();
    }     
}
