import java.io.*;
import java.util.*;
class FactRec
{
    int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else{
            return(n*factorial(n-1));
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        FactRec ob= new FactRec();
        System.out.println("Enter number to find factorial : ");
        int n=sc.nextInt();
        System.out.println("The factorial of " +n+ " is "+ob.factorial(n));
    }
}
