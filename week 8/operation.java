package mypack;
import java.util.Scanner;
class add
{
 void display(int a,int b)
{
System.out.println("ADDITION ="+(a+b));
}
}
class mul
{
void display(int a,int b)
{
System.out.println("multiplication ="+(a*b));
}
}
class main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of a and b");
int a=sc.nextInt();
int b=sc.nextInt();
add obj=new add();
mul obj2=new mul();
obj.display(a,b);
obj2.display(a,b);
}
}
