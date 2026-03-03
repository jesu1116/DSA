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
        Node  newnode=new Node(data);
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
     static Node merge(Node head1,Node head2)
    {
        if(head1==null)
        {
            return head2;
        }
        if(head2==null)
        {
           return head1;
        }
        Node head;
        if(head1.data<=head2.data)
        {
            head=head1;
            head1=head1.next;
        }
        else
        {
           head=head2;
           head2=head2.next;
        }
        Node temp=head;
        while(head1!=null&&head2!=null)
        {
             if(head1.data<=head2.data)
             {
                temp.next=head1;
                head1=head1.next;
             }
             else
             {
                temp.next=head2;
                head2=head2.next;
             }
             temp=temp.next;
        }
        if(head1!=null)
        {
            temp.next=head1;
        }
        else
        {
            temp.next=head2;
        }

        return head;
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
public class mergetwosort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        linkedlist l1=new linkedlist();
        linkedlist l2=new linkedlist();
        int data;
        do
        {
            data=sc.nextInt();
            if(data!=-1)
            {
                l1.insertatend(data);
            }
        }while(data!=-1);
        do
        {
            data=sc.nextInt();
            if(data!=-1)
            {
                l2.insertatend(data);
            }
        }while(data!=-1);
        Node ll=linkedlist.merge(l1.head,l2.head);
        linkedlist l3=new linkedlist();
        l3.head=ll;
        l3.display();


    }
}