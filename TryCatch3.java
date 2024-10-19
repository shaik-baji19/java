import java.io.*;
import java.util.*;
class TryCatch3
{
    public static void main(String args[])
    {
        int a=5,b=0,c;
        try
        {
        c=a/b;
        System.out.println("The value is c is "+c);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Arithmetic Exception caught "+ae);
        }
        catch(Exception e)
        {
            System.out.println("Exception caught "+e);
        }
        
    }
}
