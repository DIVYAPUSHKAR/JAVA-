import java.util.*;
class shapes{
public static void main(String...args)
{
poly.shape(3.5);
poly.shape(2.1,3.0);
poly.shape(5);
area a=new area();
a.circle(7);
}
}
// method overloading
class poly{
//changing no. of variable
static void shape(double r)
{
System.out.println("area of circle"+3.14*r*r);
System.out.println("perimeter of circle"+" "+2*3.14*r);
}
//changing no. of variable
static void shape(double l,double b)
{
System.out.println("perimeter of rectangle"+" "+2*l+b);
System.out.println("area of rectangle"+" "+l*b);
}
// changing type of variable
static void shape(int a)
{
System.out.println("perimeter of the square"+" "+4*a);
System.out.println("area of the square"+" "+a*a);
}
}
//method over riding
class overriding{
 void circle(double r)
 {
 System.out.println(" the radius of the circle");
 }
 }
 class area extends overriding{
 void circle(double r)
 {
System.out.println("area " + " " +3.14*r*r);
}
}
 
