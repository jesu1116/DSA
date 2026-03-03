import java.util.*;
class Stack
{
    char [] arr;
    int size;
    int top;
    Stack(int size)
    {
        this.size=size;
        arr=new char[size];
        top=-1;
    }
    void push(char ch)
    {
        if(top==size-1)
        {
            System.out.println("Stack is full");
            return;
        }
            arr[++top]=ch;
            System.out.println(ch);
        
    }
    char pop()
    {
        if(top==-1)
        {
            return '#';
        }
        return arr[top--];
    }
    void peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print(arr[top]);
    }
    boolean isEmpty()
    {
        return top==-1;
    }
}
public class validparantheses
{
    static boolean isbalanced(String s)
    {
        Stack st=new Stack(s.length());
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='{'||c=='['||c=='(')
            {
                st.push(c);
            }
            else if(c==')'||c==']'||c=='}')
            {
                if(st.isEmpty())
                {
                    return false;
                }
                char top=st.pop();
                if(c==')'&&top=='('||c==']'&&top=='['||c=='}'&&top=='{')
                {
                    continue;
                }
                else
                {
                    return false;
                }
                
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        String input=sc.nextLine();
        if(isbalanced(input))
        {
            System.out.println("valid parantheses");
        }
        else
        {
            System.out.println("Not valid parantheses");
        }
        sc.close();
    }
}