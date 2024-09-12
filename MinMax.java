import java.io.*;
import java.util.*;
class MinMax
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int min,max;
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+ " values into the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
         min=max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("Min element of array is "+min);
        System.out.println("Max element of array is "+max);
    }
}
