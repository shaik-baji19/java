import java.io.*;
 import java.util.Scanner;
 public class Switchdemo
 {
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number from 0to5");
         int num=sc.nextInt();
         switch(num)
         {
             case 0:System.out.println("You entered zero");
             break;
             case 1:System.out.println("You entered one");
             break;
             case 2:System.out.println("You entered two");
             break;
             case 3:System.out.println("You entered three");
             break;
             case 4:System.out.println("You entered four");
             break;
             case 5:System.out.println("You entered five");
             break;
             default:System.out.println("You enterd an invalid number");
         }
     }
 }
