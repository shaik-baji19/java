import java.io.*;
import java.util.*;
class LinearSearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[5],pos=-1;
        System.out.println("Enter " +n+ " values into the array");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter search element to search: ");
        int key=sc.nextInt();
       
        for(int i=0; i<n; i++)
        {
            if(arr[i]==key)
            {
            pos=i+1;
            break;
            }
        }
       

     if(pos==-1)
     {
     System.out.println(key+" Not found in the array/search unsuccessful");
     }
     else
     {
     System.out.println(key+"  found at "+pos+ " in the array");
     }
    }
}
