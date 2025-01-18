import java.util.Scanner;
class con4
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a String : ");
String s=sc.nextLine();
System.out.print("Enter another String : ");
String s1=sc.nextLine();
System.out.println("Concatenation of given strings is : "+s+" "+s1);
String s2=s.concat(s1);
System.out.println("Concatenation of given strings by using string concat method is : "+s2);
}
}
