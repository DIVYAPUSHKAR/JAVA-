import java.util.Scanner;
class employee
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter number of Employees : ");
int n=s.nextInt();
System.out.println("Enter Employees Details---");
int id[]=new int[n];
String name[]=new String[n];
String gender[]=new String[n];
String des[]=new String[n];
String address[]= new String[n];
int age[]=new int[n];
int salary[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("Kindly enter Employee "+(i+1)+" Details :-");
System.out.print("ID Number : ");
id[i]=s.nextInt();
System.out.print("Name : ");
name[i]=s.next();
System.out.print("Gender : ");
gender[i]=s.next();
System.out.print("Designation : ");
des[i]=s.next();
System.out.print("Address : ");
address[i]=s.next();
System.out.print("Salary : ");
salary[i]=s.nextInt();
System.out.print("Age : ");
age[i]=s.nextInt();
}
System.out.print("Enter Employee ID whose details you required :");
int ID=s.nextInt();
System.out.println("Employee details with "+ID+" are :-");
for(int i=0;i<n;i++)
{
if(ID==id[i])
{
System.out.println("Employee name is : "+name[i]);
System.out.println("age is : "+age[i]);
System.out.println("gender is : "+gender[i]);
System.out.println("designation is : "+des[i]);
System.out.println("salary is : "+salary[i]);
System.out.println("Address is : "+address[i]);
}
}
}
}
 
 
 
 
 

