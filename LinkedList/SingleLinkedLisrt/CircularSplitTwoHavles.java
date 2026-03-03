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
    class circularlinkedlist 
    {
        Node head;
        circularlinkedlist() 
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
        void display1()
        {
            int count=0;
            Node temp=head;
            while(temp!=null)
            {
                count++;
                temp=temp.next;
            }
            temp=head;
            int mid=(count+1)/2;
            for(int i=0;i<mid;i++)
            {
                 System.out.print(temp.data+" ");
                 temp=temp.next;
            }
            System.out.println();
        }
        void display2()
        {
            int count=0;
            Node temp=head;
            while(temp!=null)
            {
                count++;
                temp=temp.next;
            }
             temp=head;
            int mid1=(count+1)/2;
            for(int i=0;i<mid1;i++)
            {
                temp=temp.next;
            }
            for(int i=mid1;i<count;i++)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public class CircularSplitTwoHavles
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            circularlinkedlist cll=new circularlinkedlist(); 
            int data;
            do
            {
                data=sc.nextInt();
                if(data!=-1)
                {
                    cll.insertatend(data);
                }
            }while(data!=-1); 
            cll.display1();
            cll.display2();
            sc.close();
        }
    }