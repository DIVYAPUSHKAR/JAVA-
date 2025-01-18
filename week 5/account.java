import java.util.Scanner;
class Account
{
//instance variables
String Accountant_name;
int Account_number;
double amount,withdraw,deposit;
Account(String s,double a,int i,double w,double d)
{
Accountant_name=s;
amount =a;
Account_number=i;
withdraw=w;
deposit=d;}
void debit(double w)
{
if(amount >0.0)
{
amount =(amount -w);
System.out.println("Total amount after withdraw Rs."+withdraw+" is : "+amount);

System.out.println("Current Balance in Account : Rs."+amount);
}
else
{
System.out.println("Insufficient account balance");
System.out.println("Available balance is : Rs."+ amount);
}
}
void credit(double d)
{
amount =(amount +d);
System.out.println("Accountant Name : "+Accountant_name);
System.out.println("Account Number : "+Account_number);
System.out.println("Total amount after deposited Rs."+deposit+"is : "+amount);
}
}
class Bank
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter accountant name : ");
String name=s.nextLine();
System.out.print("Enter Account Number : ");
int i=s.nextInt();
System.out.print("Enter amount : Rs.");
double a=s.nextDouble();
System.out.print("Enter withdraw amount : Rs.");
double w=s.nextDouble();
System.out.print("Enter deposit amount : Rs.");
double d=s.nextDouble();
System.out.println("Account Details : ");
Account Ac=new Account(name,a,i,w,d);
Ac.credit(d);
Ac.debit(w);
}
}
