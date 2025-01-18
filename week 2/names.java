import java.util.Scanner;
class names
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the noofnames:");
int nn=sc.nextInt();
sc.nextLine();
String [] names=new String[nn];
for(int i=0;i<nn;i++)
{
System.out.println("enter the names:"+(i+1)+":");
names[i]=sc.nextLine();
}
for(int i=0;i<names.length-1;i++)
{
for(int j=0;j<names.length-1-i;j++)
if(names[j].compareTo(names[j+1])>0)
{
String temp=names[j];
names[j]=names[j+1];
names[j+1]=temp;
}
}
System.out.println("sorted names:");
for(String namess:names){
System.out.println(namess);
}
}
}



 


