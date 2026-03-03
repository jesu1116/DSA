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
     int count()
     {
         int count=0;
         Node temp=head;
         while(temp!=null)
         {
             count++;
             temp=temp.next;
         }
         return count;
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
 public class countLL
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
         ll.display();
        System.out.println(ll.count());
     }
 }