import java.util.Scanner;
class palindrome
{
public static void main(String...args)
{
double a,b,ch,cal;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of a,b:");
a=sc.nextDouble();
b=sc.nextDouble();
System.out.println("enter the operater");
ch=sc.nextInt();
if(ch==1)
{
cal=a+b;
System.out.println("ADDITION="+cal);
}
else if(ch==3)
{
cal=a-b;
System.out.println("SUBTRACTION="+cal);
}
else if(ch==4)
{
cal=a*b;
System.out.println("MULTIPLICATION="+cal);
}
else if(ch==5)
{
cal=a%b;
System.out.println("RMENDER="+cal);
}
else
{
cal=a/b;
System.out.println("QUOIENT="+cal);
}
}
}

