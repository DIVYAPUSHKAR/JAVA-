import java.util.*;
class quadratic
{
public static void main(String...args)
{
double r1,r2,b,a,c,d;
Scanner sc=new Scanner(System.in);
System.out.println("enter values of a  b and c");
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
d=(b*b)-(4*a*c);
if(d>0)
{
r1=(-b+Math.sqrt(d))/2*a;
r2=(-b-Math.sqrt(d))/2*a;
System.out.println("r1 and r2 are real roots" );
System.out.println("root 1:"+r1);
System.out.println("root 2:"+r2);
}
else if(d==0)
{
r1=-b/(2*a);
r2=-b/(2*a);
System.out.println("r1 and r2 are equal roots");
System.out.println("root 1:"+r1);
System.out.println("root 2:"+r2);
}
else
{
double realpart=-b/(2*a);
double imaginarypart=Math.sqrt(-d)/(2*a);
System.out.println("r1 and r2 are imaginary/complex roots " );
System.out.println("Root 1:"+realpart+"+"+imaginarypart+"i");
System.out.println("Root 2:"+realpart+"-"+imaginarypart+"i");
}
}
}

