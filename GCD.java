import java.io.*;
import java.util.*;
class GCD
{
    public static void main(String args[])
    {
        System.out.println("Enter two numbers to find gcd: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("GCD of "+a+" and "+b+" is "+gcd(a,b));
    }
    public static int gcd(int x,int y)
    {
        if(y==0)
            return x;
        else
            return gcd(y,x%y);
    }
}
