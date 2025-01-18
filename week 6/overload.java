import java.util.*;
class ol2
{
void cal(int a, char c)
{
System.out.println("In method of 2 parameters int and char :"+a+" "+c);
}
void cal(char c)
{
System.out.println("In method of char parameter :"+c);
}
void cal(int a)
{
System.out.println("In method of int parameter :"+a);
}
}
class overload
{
public static void main(String args[])
{
ol2 c1 = new ol2();
Scanner sc=new Scanner(System.in);
System.out.println("enter char and int");
char ch=sc.next().charAt(0);
int n=sc.nextInt();
c1.cal(n,ch);
c1.cal(ch);
c1.cal(n);
}
}
