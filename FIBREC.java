import java.io.*;
class FIBREC
{
    int fib(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
          return(fib(n-1)+fib(n-2));  
        }
    }
    public static void main(String args[])
    {
        FIBREC ob=new FIBREC();
        int n=Integer.parseInt(args[0]);
        for(int i=0;i<n;i++)
        {
            System.out.println(" "+ob.fib(i));
        }
    }
}
