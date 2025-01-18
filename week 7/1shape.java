
import java.util.Scanner;
abstract class shape1
{ 
abstract void getArea(int r,int a );
abstract void getVolume(int r,int a); 
}
class Calculations extends shape1
 {
public void getArea(int r,int a)
{ 
System.out.println("Area of the square is:" +(a*a));
System.out.println("Area of the circle is:" +(3.14*r*r));
System.out.println("Surface area of the cube is:"+(6*a*a));
System.out.println("Surface area of the sphere is"+(4*3.14*r*r));
 }
public void getVolume(int r,int a) 
{
System.out.println("Volume of the cube is:" +(a*a*a));
System.out.println("Volume of the sphereis :"+((4/3)*3.14*r*r*r));
 } 
 }
class Main 
{
 public static void main(String args[]) 
 {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the radius value of circle & sphere : ");
int R=sc.nextInt();
System.out.print("Enter the side value of cube and square: ");
int A=sc.nextInt();
shape1 sh=new Calculations();
sh.getArea(R,A);
sh.getVolume(R,A);
}
}
