import java.util.*;
class Node
{
    int data;
    Node next;
    Node (int data)
    {
        this.data=data;
        this.next=null;
    }
}
class singlelinkedlist
{
    Node head;
    singlelinkedlist()
    {
        head=null;
    }
    void insertAtend(int data)
    {
      Node newnode=new Node(data);
      if(head==null)
      {
        head=newnode;
        return;
      }
      else
      {
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
      }
    }
    void dend()
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
            return;
        }
         
            if(head.next==null)
            {
                head=null;
            }
          Node temp=head;
          while(temp.next.next!=null)
          {
                  temp=temp.next;
          }
          temp.next=null;
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
                    System.out.print("-->");
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
    singlelinkedlist sll=new singlelinkedlist();
    int data;
    do
    {
        data=sc.nextInt();
        if(data!=-1)
        {
            sll.insertAtend(data);

        }
    }while(data!=-1);
    sll.display();
    sll.dend();
    sll.display();
     
    sc.close();
  }    
}
