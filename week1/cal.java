import java.util.Scanner;
class calculator
{
public static void main(String...args)
{
double a,b,result=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of a,b:");
a=sc.nextDouble();
b=sc.nextDouble();
char op;
System.out.println("enter the operater");
op=sc.next().charAt(0);
switch(op)
{
case'+':result=a+b;
System.out.println("ADDITION="+result);
break;
case'-':result=a-b;
System.out.println("SUBSTRACTION="+result);
break;
case'*':result=a*b;
System.out.println("MULTICATION="+result);
break;
case'%':result=a%b;
System.out.println("REMAINDER="+result);
break;
case'/':result=a/b;
System.out.println("quoient="+result);
}
}
}


