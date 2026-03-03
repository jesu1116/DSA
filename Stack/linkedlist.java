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
class stack
{
    Node top;
    stack()
    {
        top=null;
    }
    void push(int data)
    {
        Node newnode=new Node(data);
        {
            newnode.next=top;
            top=newnode;
            System.out.print(data+" ");
        }
        System.out.println();
    }
    void pop()
    {
        if(top==null)
        {
            System.out.println("Stack is empty");
            return;
        }
        else
        {
             
            System.out.println(top.data);
             top=top.next;
             
        }
    }
    void peek()
    {
        if(top==null)
        {
            System.out.println("Stack is underflow");
            return;
        }
        System.out.println(top.data);
    }
    boolean isEmpty()
    {
        return top==null;
    }
    void display()
    {
        if(top==null)
        {
            System.out.println("Stack is empty");
            return;
        }
        else
        {
            Node temp=top;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
}
public class linkedlist
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        stack st=new stack();
        while(true)
        {
            int choice=sc.nextInt();
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.peek");
            System.out.println("4.Empty");
            System.out.println("5.Display");
            System.out.println("6.Exit");
            switch(choice)
            {
                case 1:
                    int data=sc.nextInt();
                    st.push(data);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    System.out.println(st.isEmpty()?"Stack is empty":"Stack is not empty");
                    break;
                case 5:
                    st.display();
                    break;
                case 6:
                    System.out.println("Exiting");
                    sc.close();
                    break;
                
            }
        }
    }
}