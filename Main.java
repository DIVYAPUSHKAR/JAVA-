package data;
import java.util.*;
class add
{
void display(int a,int b)
{
System.out.println("addition of two numbers is"+" "+(a+b));
}
}
class mul
{
void show(int c,int d)
{
 System.out.println("multiplication of two numbers is"+" "+(c*d));
 }
}
class Main
{
public static void main(String...args)
{
Scanner s=new Scanner(System.in);
add m=new add();
mul n=new mul();
System.out.println("enter numbers ");
int e=s.nextInt();
int f=s.nextInt();
m.display(e,f);
n.show(e,f);
}
}
