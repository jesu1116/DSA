import java.util.*;
class Stack
{


    int []c;
    int size;
    int top;
    Stack(int size)
      {
         this.size=size;
         c=new int[size];
         top=-1;
      }
      void push(int ch)
      {
        if(top==size-1)
        {
            System.out.println("Stack is Overflow");
            return;
        }
        c[++top]=ch;
      }
      int pop()
      {
        if(top==-1)
        {
            System.out.println("Stack is Underflow");
        }
        return c[top--];
      }
      int peek()
      {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        return c[top];
      }
      boolean isempty()
      {
        return top==-1;
      }

  
}
public class ExpressionPostfix
{
    static int exppostfix(String s)
    {
        Stack S=new Stack(s.length());
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>='0'&&c<='9')
            {
                S.push(c-'0');
            }
            else
            {   int res=0;
                int op1=S.pop();
                int op2=S.pop();
                switch(c)
                {
                   case '+':
                       res=op1+op2;
                       break;
                   case '-':
                       res=op1-op2;
                       break;
                    case '*':
                        res=op1*op2;
                        break;
                    case '/':
                        res=op1/op2;
                        break;
                    
                       


                }
                S.push(res);
            }
            
        }
        return S.pop();

    }

   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int res=exppostfix(s); 
    System.out.println(res);
   }    
}
