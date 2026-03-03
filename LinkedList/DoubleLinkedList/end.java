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
    void insertAtend(int data)
    {
         Node newNode=new Node(data);
         if(head==null)
          {
            head=newNode;
          }
        else
          {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
          }
    }
    void display()
    {
        if(head==null)
        {
            System.out.println("Linked List is empty");
            return;

        }
        else
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                if(temp.next!=null)
                {
                    System.out.print("<-> ");
                }
                temp=temp.next;

            }
            System.out.println();
        }
    }
}


public class end 
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
    dll.display();
    sc.close();
  }    
}
