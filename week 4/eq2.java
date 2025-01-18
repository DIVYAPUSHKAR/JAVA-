import java.util.Scanner;
class eq2
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String : ");
String s=sc.nextLine();
System.out.println("Enter another String : ");
String s1=sc.nextLine();
if(s.equals(s1))
{
System.out.println(s+" and "+s1+" are equal");
}
else if(s.equalsIgnoreCase(s1))
{
System.out.println(s+" and "+s1+" are equal by ignoring the case of characters");
}
else
{
System.out.println(s+" and "+s1+" are not equal");
}
}
}

