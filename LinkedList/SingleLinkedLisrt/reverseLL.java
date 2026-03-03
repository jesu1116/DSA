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
class LL
{
    Node head=null;
    void end(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
                
            }
            temp.next=newNode;
        }
    }
        void reverse()
        {
            Node prev=null;
            Node curr=head;
            Node next=null;
            while(curr!=null)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }
        void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"-->");
                temp=temp.next;
                
            }
            System.out.println("null");
        }
}
public class reverseLL
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LL ll=new LL();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int val=sc.nextInt();
                ll.end(val);
            
        }
        ll.reverse();
        ll.display();
    }
}