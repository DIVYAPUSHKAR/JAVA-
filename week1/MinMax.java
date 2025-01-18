import java.util.*;
class MinMax
{
public static void main(String...args)
{
Scanner sc=new Scanner(System.in);
int[] n=new int[5];
System.out.println("Enter any 5 Numbers");
for(int i=0;i<5;i++)
{
System.out.println("Enter integer"+(i+1)+":");
n[i]=sc.nextInt();
}
int Min=n[0];
int Max=n[0];
for(int i=1;i<5;i++)
{
if(n[i]>Max)
{
Max=n[i];
}
if(n[i]<Min)
{
Min=n[i];
}
}
System.out.println("Smallest is : "+Min);
System.out.println("Largest is : "+Max);
}
}



