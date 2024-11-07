import java.io.*;
import java.lang.String;
public class StringBufferDemo{
    public static void main(String args[]){
        StringBuffer sb1=new StringBuffer("HELLO");
        sb1.append("JAVA");
        System.out.println("The string is "+sb1);
        StringBuffer sb2=new StringBuffer("HELLO");
        sb2.insert(2,"JAVA");
        System.out.println("The string is "+sb2);
        StringBuffer sb3=new StringBuffer("HELLO");
        sb3.replace(1,3,"JAVA");
        System.out.println("The string is "+sb3);
        StringBuffer sb4=new StringBuffer("HELLO");
        sb4.delete(1,3);
        System.out.println("The String is "+sb4);
        StringBuffer sb5=new StringBuffer("HELLO");
        sb5.reverse();
        System.out.println("The String is "+sb5);
    }
}
