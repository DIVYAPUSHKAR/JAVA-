import java.util.*;
class wapper
{
public static void main(String...args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String c=s.nextLine();
System.out.println("enter the byte value");
byte b=s.nextByte();
System.out.println("enter the short");
short sc=s.nextShort();
System.out.println("enter the integer");
int i=s.nextInt();
System.out.println("enter the long");
long l=s.nextLong();
System.out.println("enter the float");
float f=s.nextFloat();
System.out.println("enter the char");
char d=s.next().charAt(0);
Byte B=b;                       //autoboxing in wapper classes:
System.out.println(B);
Integer I=i;
System.out.println(I);
Short S=sc;
System.out.println(S);
Long L=l;
System.out.println(L);
Float F=f;
System.out.println(F);
Character D=d;
System.out.println(d);
String Sc=c;
System.out.println(Sc);
//unboxing in wapper classes:
int a=I.intValue();
System.out.println(a);
byte e=B.byteValue();
System.out.println(e);
short g=S.shortValue();
System.out.println(g);
float h=F.floatValue();
System.out.println(h);
char j=D.charValue();
System.out.println(j);
//String u=Sc.StringValue();
//System.out.println(u);
}}

