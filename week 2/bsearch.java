import java.util.*;
class binary
{
public static void main(String...args)
{
int t,i,j;
Scanner s=new Scanner(System.in);
System.out.println("enter size of array");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter elements of array");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
//sorting array
for(i=0;i<n;i++)
{
for(j=i+1;j< n;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println("Sorted array is :");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("enter key");
int key=s.nextInt();
binarysearch(a,key);
int result=binarysearch(a,key);
if(result==-1)
{
System.out.println("Element not found");
}
else
{
System.out.println("Element found at index"+result);
}
}
public static int binarysearch(int []a,int key)
{
int low=0,high=a.length-1;
while(low<=high)
{
int mid=low+(high-low)/2;
if(a[mid]==key)
{
return mid;
}
if(a[mid]<key)
{
low=mid+1;
}
else
{
high=mid-1;
}
}
return -1;
}
}

