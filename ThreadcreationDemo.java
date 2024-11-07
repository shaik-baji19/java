import java.io.*;
import java.lang.String;
public class ThreadcreationDemo implements Runnable{
    public void run()
    {
        System.out.println("The thread is created and executed");
    }
    public static void main(String args[])
    {
        ThreadcreationDemo ob=new ThreadcreationDemo();
        Thread t=new Thread(ob);
        t.start();
    }
}
