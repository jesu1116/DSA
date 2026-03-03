import java.util.Scanner;

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
     void push(int x)
     {
        if(top==size-1)
        {
            System.out.println("Stack is Overflow");
            return;
        }
        arr[++top]=x;
        System.out.println(x);
     }
     void pop()
     {
        if(top==-1)
        {
            System.out.println("Stack is Underflow");
            return;
        }
        System.out.println(arr[top--]);
     }
     void peek()
     {
        if(top==-1)
        {
            System.out.println(":Stack is empty");
            return;
        }
        System.out.println(arr[top]);
    }
    boolean isEmpty()
    {
        System.out.println("Stack is empty: "+(top==-1));
       return top==-1;
    }
     void display()
     {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return;
        }
        else
        {
            for(int i =top;i>=0;i--)
            {
                System.out.print(arr[i]+" ");
            }
        }
     }
 }
public class array 
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    Stack st=new Stack(size);
    while(true)
        {
        int choice=sc.nextInt();
        System.out.println("1.Push");
        System.out.println("2.Pop");
        System.out.println("3.Peek");
        System.out.println("4.isEmpty");
        System.out.println("5.display");
        System.out.println("6.Exit");
        switch(choice)
        {
            case 1:
                int x=sc.nextInt();
                st.push(x);
                break;
            case 2:
                st.pop();
                break;
            case 3:
                st.peek();
                break;
            case 4:
                st.isEmpty();
                break;
            case 5:
                st.display();
                break;
            case 6:
                System.out.println("Exit");
                sc.close();
                break;
             


        }
        

    }
  }    
}
