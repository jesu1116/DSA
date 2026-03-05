import java.util.*;
class Stack
{
    int []arr;
    int size;
    int top=-1;
    Stack(int size)
    {
         this.size=size;
         arr=new int[size];
    }
    void push(int data)
    {
           if(top==size-1)
           {
              System.out.println("Stack is Overflow");
              return;
           }
           arr[++top]=data;
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is Underflow");
            return -1;
        }
        return arr[top--];
        
    }
    int peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    boolean isempty()
    {
        return top==-1;
    }
    void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
class stack
{
    void sort(Stack s)
    {
         if(s.isempty())
         {
            return;
         }
         int top=s.pop();
         sort(s);
         insert(s,top);
    }
    void insert(Stack s,int top)
    {
        if(s.isempty()||s.peek()<=top)
        {
              s.push(top);
              return;
        }
        int cot=s.pop();
        insert(s,top);
        s.push(cot);
    }
}
public class SortStackRecursion 
{
      public static void main(String[] args)
      {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        stack st=new stack();
        Stack SS= new Stack(n);
        for(int i=0;i<n;i++)
        {
            SS.push(sc.nextInt());
        }
        System.out.println("Original Sort: ");
        SS.display();
        st.sort(SS);
        System.out.println("Sorted: ");
        SS.display();
    }
} 
