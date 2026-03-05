import java.util.*;
class Stack
{
    int []stack;
    int []minstack;
    int top;
    int mintop;
    int size;
    Stack(int size)
    {
         this.size=size;
         stack=new int[size];
         minstack=new int[size];
         top=-1;
         mintop=-1;

    }
    void push(int data)
    {
         if(top==size-1)
         {
             System.out.println("Stack is Overflow");
             return;
         }
         stack[++top]=data;
         if(mintop==-1||data<=minstack[mintop])
         {
            minstack[++mintop]=data;
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
        if(removed==minstack[mintop])
        {
             mintop--;
        }
    }
    int peek()
    {
        if(top==-1)
        {
            return -1;
        }
        return stack[top];
    }
    int getmin()
    {
        if(mintop==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return minstack[mintop];
    }

}
public class MinStack
{
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    Stack s=new Stack(size);
    while(true)
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
                System.out.println(s.getmin());
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
