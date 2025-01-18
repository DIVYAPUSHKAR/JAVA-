import java.util.Scanner;
class comp1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
//read string s
System.out.print("Enter any String : ");
String s=sc.nextLine();
//read another string s1
System.out.print("Enter another String : ");
String s1=sc.nextLine();
//compare logic
if(s.compareTo(s1)>0)
{
System.out.println(s+" > "+s1);
}
else if(s.compareTo(s1)<0)
{
System.out.println(s+" < "+s1);
}
else
{
System.out.println("Given two Strings are equal");
}
}
}
