import java.util.Scanner;
abstract class Employee {
abstract void getAmount(int m,int n); }
class HE extends Employee {
public void getAmount(int m,int wage)
{ System.out.println("Amount paid to hourly employee :"+(m*wage)); } }
class WE extends Employee {
public void getAmount(int p,int Wage)
{ System.out.println("Amount paid to Weekly employee :"+(p*Wage)); } }
class emp2 { public static void main(String args[])
{ Scanner sc=new Scanner(System.in);
System.out.print("Enter no.of hours Hourly Employee worked : ");
int a=sc.nextInt();
System.out.print("Enter Wage value of Hourly Employee :");
int b=sc.nextInt();
System.out.print("Enter no.of weeks Weekly Employee worked :");
int c=sc.nextInt();
System.out.print("Enter Wage value of Weekly Employee :");
int d=sc.nextInt();
Employee sc1= new HE();
Employee sc2= new WE();
sc1.getAmount(a,b);
sc2.getAmount(c,d); }
}


