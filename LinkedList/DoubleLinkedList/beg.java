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
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    void displaybackward()
    {if(head==null)
    {
        System.out.println("Linked List is empty");
        return;
    }
    Node temp=head;
    while(temp.next!=null)
    {
        temp=temp.next;
    }
    while(temp!=null)
    {
        System.out.print(temp.data+" ");
        if(temp.prev!=null)
        {
            System.out.print("<-> ");
        }
        temp=temp.prev;
   }
   System.out.println();
    }
void displayforward()
{
    if(head==null)
    {
        System.out.println("Linked List is empty");
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
public class beg 
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
    dll.displayforward();
    dll.displaybackward();
    sc.close();
   }    
}
