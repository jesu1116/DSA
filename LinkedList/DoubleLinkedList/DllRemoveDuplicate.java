import java.util.*;
class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = next = null;
    }
}

class DoublyLinkedList {

    Node head;
    void insert(int data)
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

    // Remove duplicates in sorted DLL
    void remove() {
        if (head == null) return;

        Node current = head;

        while (current != null&&current.next!=null) {

            if (current.data == current.next.data) {

                Node duplicate = current.next;

                current.next = duplicate.next;

                if (duplicate.next != null) {
                    duplicate.next.prev = current;
                }
            } 
            else {
                current = current.next;
            }
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
public class DllRemoveDuplicate
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        DoublyLinkedList dll=new DoublyLinkedList();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            dll.insert(sc.nextInt());
        }
        dll.remove();
        dll.display();
    }
}