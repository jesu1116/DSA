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
    Node  head;
    doublelinkedlist()
    {
        head=null;
    }
    void insertAtend(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.prev=temp;
        }
    }
    void deleteAtend()
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
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.prev.next=null;

    }
    void display()
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
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
public class dend
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
            dll.insertAtend(data);
        }

    }while(data!=-1);
    dll.deleteAtend();
    dll.display();
  }    
}
