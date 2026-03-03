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
class singlelinkedlist
{
    Node head;
    singlelinkedlist()
    {
        head=null;
    }
    void insertAtbeg(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
            {
                head=newnode;
                return;
            } 
            else
            {
                newnode.next=head;
                head=newnode;
            }
    }
    void  dbeg()
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
public class dbeg 
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
            sll.insertAtbeg(data);
        }
    }while(data!=-1);
    sll.display();
    sll.dbeg();
    sll.display();
   }    
}
