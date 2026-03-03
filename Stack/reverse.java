import java .util.*;
class stack
{
   char []arr;
   int size;
   int top=-1;
   stack(int size)
   {
    this.size=size;
    arr=new char[size];
   }
   void push(char ch)
   {
    if(top==size-1)
    {
        System.out.println("Stack is Overflow");
        return;
        
    }
    arr[++top]=ch;
    System.out.print(ch);
    // System.out.println();
    
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
    System.out.println(arr[top]);
   }
   boolean isEmpty()
   {
    return top==-1;
   }
   void display()
   {
    // System.out.println();
    for(int i=top;i>=0;i--)
    {
        System.out.print(arr[i]+" ");
    }
   }
}

public class reverse 
{
  public static void main(String[] args) 
  {
      Scanner sc=new Scanner(System.in);
      String input=sc.nextLine();
      stack st=new stack(input.length());
      for(int i=0;i<input.length();i++)
      {
        st.push(input.charAt(i));
      }
        String s="";
        while(true)
        {
            char c=st.pop();
            if(c=='#')
            {
                break;
            }
            s=s+c;
        }
        System.out.println();
        System.out.println(s);
        sc.close();
      

  }    
}
