import java.io.*;
import java.util.Scanner;

class Primenumbers
{
public static void main(String args[])
{
int start,end;
int c;
Scanner sc = new Scanner(System.in);
System.out.print("Enter Start value(+ve) : ");
start=sc.nextInt();
System.out.print("Enter End value(+ve)   : ");
end=sc.nextInt();
System.out.print("\nTHE PRIME NUMBERS FROM "+start+" TO "+end+" ARE : ");
for(int i=start;i<=end;i++)
{
c=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
c=1;
break;
}
}
if(c==0)
System.out.print(i+" ");
}
System.out.print("\n");
}
}

