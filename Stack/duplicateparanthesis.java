 import java.util.*;
 class Stack
 {
     char[]a;
     int top=-1;
     int size;
     Stack(int size)
     {
         this.size=size;
         a=new char[size];
     }
     void push(char ch)
     {
         if(top==size-1)
         {
             return ;
         }
         a[++top]=ch;
         
     }
     char pop()
     {
         if(top==-1)
         {
             return'#';
         }
         return a[top--];
     }
     char peek()
     {
         if(top==-1)
         {
             return'#';
         }
         return a[top];
     }
     boolean isEmpty()
     {
         return top==-1;
     }
     void display()
     {
         
        for(int i=top;i>=0;i--)
          {
            System.out.print(a[i]+" ");
          }
     }
 }
 public class duplicateparanthesis
 {
      boolean isvalid(String s)
     {
         Stack st=new Stack(s.length());
         for(int i=0;i<s.length();i++)
         {
             char c=s.charAt(i);
             if(c==')')
             {
                 int count=0;
                 while(st.peek()!='(')
                 {
                     st.pop();
                     count++;
                 }
                 st.pop();
                 if(count<=1)
                 {
                     return true;
                 }
                 
             }
             else
             {
                 st.push(c);
             }
         }
         return false;
     }
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         duplicateparanthesis m=new duplicateparanthesis();
         String S=sc.nextLine();
         if(m.isvalid(S))
         {
             System.out.println("Yes");
         }
         else
         {
             System.out.println("No");
         }
         sc.close();
     }
 }
 