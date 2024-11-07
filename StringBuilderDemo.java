import java.io.*;
import java.lang.String;
public class StringBuilderDemo{
    public static void main(String args[]){
        StringBuilder sb1=new StringBuilder("HELLO");
        sb1.append("JAVA");
        System.out.println("The string is "+sb1);
        StringBuilder sb2=new StringBuilder("HELLO");
        sb2.insert(2,"JAVA");
        System.out.println("The string is "+sb2);
        StringBuilder sb3=new StringBuilder("HELLO");
        sb3.replace(1,3,"JAVA");
        System.out.println("The string is "+sb3);
        StringBuilder sb4=new StringBuilder("HELLO");
        sb4.delete(1,3);
        System.out.println("The String is "+sb4);
        StringBuilder sb5=new StringBuilder("HELLO");
        sb5.reverse();
        System.out.println("The String is "+sb5);
    }
}
