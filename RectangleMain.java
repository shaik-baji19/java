import java.io.*;
import java.util.*;
class RectangleArea{
    int l,b;
    float area(){
        return l*b;
    }
}
class RectangleMain{
    public static void main(String args[]){
        RectangleArea ra=new RectangleArea();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter l,b values: ");
        ra.l=sc.nextInt();
         ra.b=sc.nextInt();
         System.out.println("Rectangle Area"+ra.area());
    }
}
