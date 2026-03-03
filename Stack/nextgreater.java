import java.util.*;
class Stack
{
    int []arr;
    int top;
    int size;
    Stack(int size)
    {
        this.size=size;
        arr=new int [size];
        top=-1;
    }
    void push(int data)
    {
        if(top==size-1)
        {
            System.out.println("Overflow");
            return;
        }
        arr[++top]=data;
    }
    int pop()
    {
        if(top==-1)
        {
            return -1;
        }
       return  arr[top--];
    }
    int peek()
    {
        if(top==-1)
        {
            return -1;
        }
        return arr[top];
    }
    boolean isempty()
    {
        return top==-1;
    }
}
class NGE
{
    void nge (int []arr,int n)
    {
        Stack s=new Stack(n);
        int []res=new int [n];
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isempty()&&s.peek()<=arr[i])
            {
                s.pop();
            }
            if(s.isempty())
            {
                res[i]=-1;
            }
            else
            {
                res[i]=s.peek();
            }
            s.push(arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
class nextgreater
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        NGE ng=new NGE();

        ng.nge(arr,n);
        sc.close();


    }
}
 