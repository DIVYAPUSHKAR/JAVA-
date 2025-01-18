import java.util.Scanner;
class sorting
{
public static void main(String... args)
{
int i,t,n,j;
System.out.println("enter the n value:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ELEMENTS");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
//System.out.println(a[i]+" ");
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println();
System.out.println("assending order");
for(i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}


