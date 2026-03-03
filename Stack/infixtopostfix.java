import java.util.*;
class Stack
{
    char[]a;
    int top;
    int size;
    Stack(int size)
    {
        this.size=size;
        a=new char[size];
        top=-1;
    }
    void push(char c)
    {
        if(top==size-1)
        {
            return;
        }
        a[++top]=c;
    }
    char pop()
    {
        if(top==-1)
        {
            return'0';
        }
        return a[top--];
    }
    char peek()
    {
        if(top==-1)
        {
            return'0';
        }
        return a[top];
    }
    boolean isempty()
    {
        return top==-1;
    }

}
class main
{
    static int precedence(char ch)
    {
        if(ch=='+'||ch=='-')
            return 1;
        if(ch=='*'||ch=='/')
            return 2;
        return 0;
    }
   static String convert(String s)
    {
        Stack stack = new Stack(s.length());
        String postfix="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                postfix+=ch;
            }
            else if(ch=='(')
            {
                stack.push(ch);
            }
            else if(ch==')')
            {
                while(stack.peek()!='(')
                {
                    postfix+=stack.pop();
                }
                stack.pop();
            }
            else
            {
                while(!stack.isempty()&&precedence(stack.peek())>=precedence(ch))
                {
                    postfix+=stack.pop();
                }
                stack.push(ch);
            }
        }
        while(!stack.isempty())
        {
            postfix+=stack.pop();
        }
        return postfix;
    }
}
public class infixtopostfix
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         main m=new main();
        String infix=sc.nextLine();
        String postfix=m.convert(infix);
        System.out.println(postfix);
        sc.close();
    }
}