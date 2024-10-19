import java.io.*;
import java.util.*;
class TryCatch5
{
    public static void main(String args[])
    {
        int a=5,b=0,c;
        try
        {
           throw new IOException();
        }
        catch(IOException ioe)
        {
            System.out.println("IOException caught "+ioe);
        }
    }
}
