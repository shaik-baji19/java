import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        int m,n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        m=sc.nextInt();
        do{
            sum=0;
            while(m>0)
            {
                n=m%10;
                sum=sum+n;
                m=m/10;
            }
            m=sum;
        }while(sum>9);
        System.out.println("Sum of digits: "+sum);
        
    }
}
