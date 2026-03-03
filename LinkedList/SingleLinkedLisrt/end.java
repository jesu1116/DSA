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
    Node head=null;
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
    void display()
    {
        if(head==null)
        {
            System.out.println("Linked list is emppty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"");
            if(temp.next!=null)
            {
                System.out.print("-->");

            }
            temp=temp.next;
        }
    }
}

public class end 
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
    sc.close();
  }    
}
