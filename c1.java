import java.util.Scanner;
class string
{
public static void main(String args[])
{
System.out.println("enter the string:");
Scanner sc =new Scanner (System.in);
String A =sc.nextLine();
System.out.println("enter the string:");
String B =sc.nextLine();
if(A.compareTO(B)>0)
{System.out.println(A+">"+B);
}
else if(A.compareTO( B)<0)
{System.out.println(A+"<"+B);
}
else
{System.out.println(A+"="+B);
}
}}




