import java.util.*;
class shape
{
void area(float x,float y)
{
System.out.println("area of reactangle is "+x*y);
}
void perimeter(float x,float y)
{
System.out.println("perimeter of reactangle is "+2*(x+y));
}
void area(float x)
{
System.out.println("area of square is "+x*x);
}
void perimeter(float x)
{
System.out.println("perimeter of square is "+4*x);
}
void Area(double x)
{ 
double z=(3.14*x*x);
System.out.println("area of circle is "+z);
} 
void perimeter(double x)
{
double  a=2*3.14*x;
System.out.println("perimeter of circle is "+a);
}
void Area(int x,int y)
{
float r=(x*y)/2;
System.out.println("area of triangle is "+r);
}
}
class d
{
public static void main(String...args)
{
shape s=new shape();
Scanner p=new Scanner(System.in);
System.out.println("enter the values of x,y,z,a,b,c");
float x=p.nextFloat();
float y=p.nextFloat();
float z=p.nextFloat();
double a=p.nextDouble();
int b=p.nextInt();
int c=p.nextInt();
s.area(x,y);
s.perimeter(x,y);
s.area(z);
s.perimeter(z);
s.Area(a);
s.perimeter(a);
s.Area(b,c);
}
}
