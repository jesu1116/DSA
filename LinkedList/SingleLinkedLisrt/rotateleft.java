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
    void rotate(int k)
    {
        if(head==null||k==0)
        {
            return;
        }
        int length=0;
        Node temp=head;
        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
        k=k%length;
        for(int i=0;i<k;i++)
        {
            Node first=head;
            head=head.next;
            Node last=head;
            while(last.next!=null)
            {
                last=last.next;         
            }
            last.next=first;
            first.next=null;
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

public class rotateleft
{
    public static void main(String[] args)
      {
          Scanner sc=new Scanner (System.in);
          singlelinkedlist ll=new singlelinkedlist();
          int data;
          do
          {
            data=sc.nextInt();
            if(data!=-1)
            {
                ll.insertatend(data);
            }
          }while(data!=-1);
          int k=sc.nextInt();
          ll.rotate(k);
          ll.display();
          sc.close();
      }    

}
