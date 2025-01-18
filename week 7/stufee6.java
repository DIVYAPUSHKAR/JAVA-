import java.util.Scanner;
interface Studentfee
 {
void getAmount(int clgfee);
void getFirstname(String fname);
void getLastname(String lname);
void getAddress(String address);
void getContact(double contact); 
}
class Hostler implements Studentfee
 {
public void getAmount(int clgfee)
 {
int hostelfee=5000;
System.out.println("Fee payed by hostler : "+(clgfee+hostelfee)); 
}
public void getFirstname(String fname)
{ 
System.out.println("First name of the student : "+fname);
 }
public void getLastname(String lname)
{ 
System.out.println("Last name of the student : "+lname); 
}
public void getAddress(String address)
{ 
System.out.println("Address of the student : "+address);
 }
public void getContact(double contact)
{ 
System.out.println("Contact number of the student : "+contact); 
}
 }
class NonHostler implements Studentfee
 {
public void getAmount(int clgfee) 
{
System.out.println("Fee payed by non-hostler : "+(clgfee)); 
}
public void getFirstname(String fname)
{ 
System.out.println("First name of the student : "+fname);
 }
public void getLastname(String lname)
{ 
System.out.println("Last name of the student : "+lname); 
}
public void getAddress(String address)
{ 
System.out.println("Address of the student : "+address); 
}
public void getContact(double contact)
{
 System.out.println("Contact number of the student : "+contact); 
 }
  }
class stufee6 
{
public static void main(String args[]) 
{

Scanner s=new Scanner(System.in);
Studentfee h= new Hostler();
System.out.println("Enter clg fee : ");
int c=s.nextInt();
System.out.println("Enter First name : ");
String f=s.next();
System.out.println("Enter Last name : ");
String l=s.next();
System.out.println("Enter Address : ");
String a=s.next();
System.out.println("Enter Contact number : ");
int cn=s.nextInt();
System.out.println("\n");
Studentfee h1= new NonHostler();
System.out.println("Enter clg fee : ");
int cf=s.nextInt();
System.out.println("Enter first name : ");
String fn=s.next();
System.out.println("Enter last name : ");
String ln=s.next();
System.out.println("Enter Address : ");
String ca=s.next();
System.out.println("Enter Contact number : ");
int n=s.nextInt();
h.getAmount(c);
h.getFirstname(f);
h.getLastname(l);
h.getAddress(a);
h.getContact(cn);
h1.getAmount(cf);
h1.getFirstname(fn);
h1.getLastname(ln);
h1.getAddress(ca);
h1.getContact(n);
}
}
