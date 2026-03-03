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
    void insertAtend(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            
        }
        temp.next=newNode;
    }
    void search(int key)
    {
        Node temp=head;
        int position =1;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                System.out.println(temp.data+" "+position);
                return;
            }
            
        temp=temp.next;
        position++;
        }
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class search
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LL ll=new LL();
        int val;
        do
        {
            
         val=sc.nextInt();
         if(val!=-1)
         {
         ll.insertAtend(val);
         }
        }while(val!=-1);
        int key=sc.nextInt();
        ll.display();
        ll.search(key);
    }
}