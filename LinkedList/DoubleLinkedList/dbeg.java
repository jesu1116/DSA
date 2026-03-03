import java.util.*;
class Node
{
    Node prev;
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
class doublelinkedlist
{
    Node head=null;
    void insertAtbeg(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        
    }
    void deleteAtbeg()
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        head=head.next;
        head.prev=null;
    }
    void display()
    {
        if(head==null)
        {
            System.out.println("Linked list is empty ");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            if(temp.next!=null)
            {
                System.out.print("<->");
            }
            temp=temp.next;

        }
        System.out.println();
    }
}

public class dbeg 
{
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    doublelinkedlist dll=new doublelinkedlist();
    int data;
    do
    {
        data=sc.nextInt();
        if(data!=-1)
        {
            dll.insertAtbeg(data);
        }

    }while(data!=-1);
    dll.deleteAtbeg();
    dll.display();
    sc.close();


   }    
}
