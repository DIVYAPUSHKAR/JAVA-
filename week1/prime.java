import java.util.*;
class primefactor
{
public static void main(String ... args)
{
 int n,i,j,count=0;
 Scanner sc =new Scanner(System.in);
 System.out.println("enter any value:");
 n=sc.nextInt();
 System.out.println("Prime factors of given number are:");
 for(i=1;i<=n;i++)
{
if(n%i==0)
{
count=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
count++;
}
if(count==2)
System.out.println(+i);
}
}
 }
 }
  
