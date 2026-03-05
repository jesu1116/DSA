import java.util.*;
class Stack
{
    int []stack;
    int []maxstack;
    int size;
    int top;
    int maxtop;
    Stack(int size)
    {
        this.size=size;
        stack=new int[size];
        maxstack=new int[size];
        top=-1;
        maxtop=-1;
    }
    void push(int data)
    {
         if(top==size-1)
         {
            System.out.println("Stack is Overflow");
            return;
         }
         stack[++top]=data;
         if(maxtop==-1||data>=maxstack[maxtop])
         {
            maxstack[++maxtop]=data;
         }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is Underflow");
            return;
        }
        int removed=stack[top--];
        if(removed==maxstack[maxtop])
        {
            maxtop--;
        }
    }
    int peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    int getmax()
    {
        if(maxtop==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return maxstack[maxtop];
    }
}
public class MaxStack 
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       Stack s=new Stack(size);
       while (true)
       { 
          int ch=sc.nextInt();
          switch(ch)
          {
            case 1:
               int data=sc.nextInt();
               s.push(data);
               break;
            case 2:
                s.pop();
                break;
            case 3:
                 System.out.println(s.peek());
                break;
            case 4:
                System.out.println(s.getmax());
                break;
            case 5:
                System.out.println("Exiting...");
                sc.close();
                return;

                default:
                    System.out.println("Invalid Choice");
          }    
       }

   }    
}
