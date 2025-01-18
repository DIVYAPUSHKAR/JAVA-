import java.util.Scanner;
class palindrome
{
public static void main(String...args)
{
int n,rev=0,rem,t;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n:");
n=sc.nextInt();
t=n;
while(n>0)
{
rem=n%10;
n=n/10;
rev=rev*10+rem;
}
if(rev==t)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}
