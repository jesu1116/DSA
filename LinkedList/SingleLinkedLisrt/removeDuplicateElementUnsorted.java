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
class linkedlist
{
    Node head;
    linkedlist()
    {
        head=null;
    }
    void insertatend(int data)
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
    void remove()
    {
         
        Node current=head;
        while(current!=null)
        {
            Node run=current;
            while(run.next!=null)
            {
                if(run.next.data==current.data)
                {
                    run.next=run.next.next;
                }
                else
                {
                    run=run.next;
                }
            }
            current=current.next;
        }
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
            temp=temp.next;
        }
    }
}

public class removeDuplicateElementUnsorted 
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    linkedlist list=new linkedlist();
    int data;
    do
    {
         data=sc.nextInt();
         if(data!=-1)
         {
            list.insertatend(data);
         }
    }while(data!=-1);
    list.remove();
    list.display();

  }    
}
