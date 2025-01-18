/*6. Create an Interface StudentFee with method getAmount(),getFirstName(),getLastName(),
getAddress(), getContact(). Calculate the amount paid by the Hostler and NonHostler
student by implementing interface Student Fee.*/

import java.util.Scanner;

interface studentfee
{
void getamount(float f);
void getfname(String fn);
void getlname(String l);
void getaddress(String a);
void getcontact(String c);
}
class hostler implements studentfee
{
public void getamount(float f)
{
System.out.println("Student fee:"+f);
}
public void getfname(String fn)
{
System.out.println("firstname of the student:"+fn);
}
public void getlname(String l)
{
System.out.println("lastname of the student:"+l);
}
public void getaddress(String a)
{
System.out.println("address of the student:"+a);
}
public void getcontact(String c)
{
System.out.println("contact of the student:"+c);
}
}
class nonhostler implements studentfee
{
public void getamount(float f)
{
System.out.println("Student fee:"+f);
}
public void getfname(String fn)
{
System.out.println("firstname of the student:"+fn);
}
public void getlname(String l)
{
System.out.println("lastname of the student:"+l);
}
public void getaddress(String a)
{
System.out.println("address of the student:"+a);
}
public void getcontact(String c)
{
System.out.println("contact of the student:"+c);
}
}
 class p6
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the details of the hostler:");
System.out.println("enter the student fee:");
float f=sc.nextFloat();
sc.nextLine();
System.out.println("enter the student firstname:");
String fn=sc.nextLine();
System.out.println("enter the student lastname:");
String l=sc.nextLine();
System.out.println("enter the student address:");
String a=sc.nextLine();
System.out.println("enter the student contact number:");
String c=sc.nextLine();
System.out.println("enter the details of the Non-hostler:");
System.out.println("enter the student fee:");
float fe=sc.nextFloat();
sc.nextLine();
System.out.println("enter the student firstname:");
String fna=sc.nextLine();
System.out.println("enter the student lastname:");
String la=sc.nextLine();
System.out.println("enter the student address:");
String ad=sc.nextLine();
System.out.println("enter the student contact number:");
String co=sc.nextLine();

hostler h=new hostler();
nonhostler n=new nonhostler();

System.out.println("details of the hostler:");
h.getamount(f);
h.getfname(fn);
h.getlname(l);
h.getaddress(a);
h.getcontact(c);
System.out.println("details of the Non-hostler:");
n.getamount(fe);
n.getfname(fna);
n.getlname(la);
n.getaddress(ad);
n.getcontact(co);
}
}



