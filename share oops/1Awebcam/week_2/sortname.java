import java.util.Scanner;
class sortname
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size");
int s=sc.nextInt();
int n=s+1;
String a[]=new String[n];
int i;
System.out.println("Enter "+s+" Names");
for(i=0;i<n;i++)
{
a[i]=sc.nextLine();
}
System.out.println("Given Names in Sorting order is:");
for(i=0;i<n;i++)
{
String temp;
for(int j=i+1;j<n;j++)
{

if(a[i].compareTo(a[j])>0)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}

