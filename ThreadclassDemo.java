import java.io.*;
import java.lang.String;
public class ThreadclassDemo extends Thread{
    public static void main(String args[]){
        Thread t1=new Thread("My Thread");
        ThreadclassDemo t2=new ThreadclassDemo();
        t1.start();
        t2.start();
        String str=t1.getName();
        System.out.println("The name of thread1 is "+str);
    }
    public void run(){
        System.out.println("Thread is created and executed");
    }
}
