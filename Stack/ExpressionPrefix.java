import java.util.*;
class Stack
{
    int[]arr;
    int top;
    int size;
    Stack(int size)
    {
        this.size=size;
        arr=new int[size];
        top=-1;
    }
    void push(int ch)
    {
         if(top==size-1)
         {
            System.out.println("Stack is Overflow");
            return;
         }
         arr[++top]=ch;
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is Underflow");
            return '0';
        }
        return arr[top--];
    }
    int peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return '0';
        }
        return arr[top];
    }
    boolean isEmpty()
    {
        return top==-1;
    }
} 
class STACK
{
     static int prefix(String S)
     {
        Stack st=new Stack(S.length());
        for(int i=S.length()-1;i>=0;i--)
        {
            char ch=S.charAt(i);
            if(ch>='0'&&ch<='9')
            {
                st.push(ch-'0');
            }
            else
            {
                int val2=st.pop();
                int val1=st.pop();
                int res=0;
                switch(ch)
                {
                    case '+':
                        res=val1+val2;
                        break;
                    case '-':
                        res=val1-val2;
                        break;
                    case '*':
                        res=val1*val2;
                        break;
                    case '/':
                        res=val1/val2;
                        break;
                }
             st.push(res);
            }
        }
        return st.pop();
     }
}
public class ExpressionPrefix
{
   public static void main(String[] args)
   {
    Scanner sc=new Scanner (System.in);
    STACK s=new STACK();
    String S=sc.nextLine();
     int res=s.prefix(S);
     System.out.println(res);
   }    
}
