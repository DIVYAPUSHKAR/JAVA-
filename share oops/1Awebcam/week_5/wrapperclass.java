import java.util.Scanner;
class wrap1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a Number : ");
int a=s.nextInt();
Integer c= new Integer(a);
System.out.print("Enter another Number : ");
int b=s.nextInt();
Integer d= new Integer(b);
System.out.println("Addition of given numbers is: "+(c+d));
System.out.println("Subtraction of given numbers is: "+(c-d));
System.out.println("Multiplication of given numbers is: "+(c*d));
System.out.println("Division of given numbers is: "+(c/d));
}
}
