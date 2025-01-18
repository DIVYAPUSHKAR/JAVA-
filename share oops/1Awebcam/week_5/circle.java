import java.util.Scanner;
class cir
{
double r;
double Area()
{
return (22/7)*r*r;
}
double Perimeter()
{
return 2*(22/7)*r;
}
}
//class declares multiple objects of circle
class cir2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
cir c=new cir();//object1
System.out.print("Enter the radius of circle : ");
double R=s.nextDouble();
c.r=R;
System.out.println("Perimeter of circle is : "+c.Perimeter());
System.out.println("Area of circle is : "+c.Area());
}
}
