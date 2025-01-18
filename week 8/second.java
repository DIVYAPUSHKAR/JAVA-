package org.shapes;
import java.util.Scanner;
class square
{
void display(int s)
{
System.out.println("area  of square:"+(s*s));
System.out.println("peri  of square:"+(4*s));
}
}
class triangle
{
void display(int l,int b)
{
System.out.println("area  of tri:"+(l*b));
System.out.println("peri  of tri:"+((l*b)/2));
}
}
class circle
{
void display(double r)
{
System.out.println("area  of cir:"+(r*r));
System.out.println("peri  of cir:"+(2*3.14*r));
}
}
class main
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the value of s:");
int s=sc.nextInt();
square obj=new square();
System.out.println("enter the value of l and b:");
int l=sc.nextInt();
int b=sc.nextInt();
triangle obj2=new triangle();
System.out.println("enter the value r:");
double r=sc.nextDouble();
circle obj3=new circle();
obj.display(s);
obj2.display(l,b);
obj3.display(r);
}
}
