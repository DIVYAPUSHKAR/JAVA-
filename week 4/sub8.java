import java.util.Scanner;
class sub8
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a String : ");
String s=sc.nextLine();
System.out.println("Length of given string is :"+s.length());
System.out.print("Enter a number for substring starts from : ");//from which index the substring should start from
int n=sc.nextInt();
String s1=s.substring(n);
System.out.println(s1);
System.out.print("Enter any interval below :");//substring we want in the interval we want
int a=sc.nextInt();
int b=sc.nextInt();
String s2=s.substring(a,b);
System.out.print("Substring in given interval is :");
System.out.println(s2);
}
}
