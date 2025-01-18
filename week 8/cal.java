package calculator;
import calculator.*;
import java.util.Scanner;
class cal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("1.add\n2.mul\n3div");
while(true)
{
System.out.println("enter the value of n:");
int n=sc.nextInt();
switch(n)
{
case 1:
System.out.println("enter the value of a and b:");
int a=sc.nextInt();
int b=sc.nextInt();
add obj=new add();
obj.display(a,b);
break;
}
case 2:
System.out.println("enter the value of a and b:");
int a=sc.nextInt();
int b=sc.nextInt();
mul obj=new mul();
obj.display(a,b);
break;
case 3:
System.out.println("enter the value of a and b:");
int a=sc.nextInt();
int b=sc.nextInt();
div obj=new div();
obj.display(a,b);
break;
default:System.out.printl("enter valid one:");
break;
}
}
}





