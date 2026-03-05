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
        Node  newnode=new Node(data);
        newnode.next=top;
        top=newnode;
    }
    void remove(int data)
    {
       if(top==null)
       {
          return;
       }
       if(top.data==data)
       {
        top=top.next;
        return;
       }
       Node prev=top;
       Node curr=top.next;
       while(curr!=null&&curr.data!=data)
       {
        prev=curr;
        curr=curr.next;
       }
       if(curr!=null)
       {
        prev.next=curr.next;
       }
    }
    int removeBottom()
    {
        if(top==null)
        {
            return -1;
        }
        if(top.next==null)
        {
            int val=top.data;
            top=null;
            return val;
        }
        Node prev=null;
        Node curr=top;
        while(curr.next!=null)
        {
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
        return curr.data;

    }

}
class LRUCache
{
    int capacity;
    HashMap<Integer,Integer>map;
    stack s;
    LRUCache(int cap)
    {
        capacity=cap;
        map=new HashMap<>();
        s=new stack();
    }
    int get(int key)
    {
        if(!map.containsKey(key))
        {
            return -1;
        }
        s.remove(key);
        s.push(key);
        return map.get(key);
    }
    void put(int key,int data)
    {
        if(map.containsKey(key))
        {
            map.put(key,data);
            s.remove(key);
            s.push(key);

        }
        else
        {
            if(map.size()==capacity)
            {
                int lru=s.removeBottom();
                map.remove(lru);
            }
            map.put(key,data);
            s.push(key);
        }
    }
    void display()
    {
        Node temp=s.top;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class LRUCacheStack
{ 
  public static void main(String[] args)  
  {
    Scanner sc=new Scanner(System.in);
    int capacity=sc.nextInt();
    LRUCache cache=new LRUCache(capacity);
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        String op=sc.next();
        if(op.equals("put"))
        {
            int key=sc.nextInt();
            int val=sc.nextInt();
            cache.put(key,val);
        }
        else if(op.equals("get"))
        {
           int key=sc.nextInt();
           System.out.println(cache.get(key));
        }
    }
    cache.display();
  }
}
