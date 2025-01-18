import java.util.Scanner;
class rev7
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a String : ");
String s=sc.nextLine();
int n=s.length();
System.out.print("Reverse of given string is : ");
for(int i=n-1;i>=0;i-- )
{
char rev=s.charAt(i);
System.out.print(rev);
}
System.out.println("");
}
}
