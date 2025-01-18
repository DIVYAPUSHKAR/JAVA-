import java.util.Scanner;
class count5
{
public static void main(String args[])
{
String str;
Scanner sc = new Scanner(System.in);
System.out.println("Enter your sentence : ");
str = sc.nextLine();
int vow=0, con=0, digits=0, spaces=0;
char ch;
str=str.toLowerCase();
for(int i = 0; i < str.length(); ++i)
{
ch = str.charAt(i);
if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'||ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'||ch=='U')
{
++vow;
}
else if((ch >= 'a' && ch <= 'z'))
{
++con;
}
else if(ch >= '0' && ch <= '9')
{
++digits;
}
else if(ch == ' ')
{
++spaces;
}
}
System.out.println("Vowels : " +vow);
System.out.println("Consonants : " +con);
System.out.println("Digits : " +digits);
System.out.println("White spaces : " +spaces);
}
}
