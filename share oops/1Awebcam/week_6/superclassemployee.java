import java.util.Scanner;
class employee
{ String fname,lname;
void getfirstName(String fname)
{ this.fname=fname; }
void getLastName(String lname){ this.lname=lname; } }
class contract_Employee
{ String fname,lname,desig,depart;
int basicpay,month;
void displayfullname(String fname,String lname,String desig,String depart)
{ System.out.println("Employee Details are :\nEmployee firstname is :"+fname+"\nEmployee lastname is : "+lname);
System.out.println("Designation is : "+desig+" \nDepartment is :"+depart); }
void getdepartment(String depart)
{ this.depart=depart; }
void getdesignation(String desig)
{ this.desig=desig; }
double salary(int basicpay,int month)
{ int salary1=basicpay*month; return salary1; } }
class regular_Employee
{ String fname,lname,desig,depart;
int basicpay,month;
void displayfullname(String fname,String lname,String
desig,String depart)
{ System.out.println("Employee Details are :\nEmployee firstname is : "+fname+"\nEmployee lastname is : "+lname);
System.out.println("Designation is : "+desig+" Department is :"+depart); }
void getdepartment(String depart)
{ this.depart=depart; }
void getdesignation(String desig)
{ this.desig=desig; }
double salary(int basicpay,int month)
{ double bonus,salary2,tax,hra;
bonus=basicpay*(8.33/100);
hra=(basicpay*month)*(50/100);
if(basicpay>250000)
{ salary2=(basicpay*month)+hra+bonus; }
else if(basicpay>250001 && basicpay<500000){ tax=(5/100)*basicpay;
salary2=(basicpay*month)+hra+bonus-tax; }
else if(basicpay>500001 && basicpay<1000000)
{ tax=(20/100)*basicpay;
salary2=(basicpay*month)+hra+bonus-tax; }
else { tax=(30/100)*basicpay;
salary2=(basicpay*month)+hra+bonus-tax; }
return salary2; } }
class employee_details
{ public static void main(String args[])
{ Scanner sc=new Scanner(System.in);
Scanner sc1=new Scanner(System.in);
String fname,lname,desig,depart;
employee e1=new employee();
System.out.print("Enter the first name of the employee:");
fname=sc1.nextLine();
e1.getfirstName(fname);
System.out.print("Enter the last name of the employee:");
lname=sc1.nextLine(); e1.getLastName(lname);
System.out.println("Enter\n1 for Regular employee \n2 forContract employee");
int l=sc.nextInt();
if(l==1)
{ regular_Employee r1=new regular_Employee();
System.out.print("Enter the department :");
depart=sc1.nextLine();
r1.getdepartment(depart);
System.out.print("Enter your designation :");
desig=sc1.nextLine();
r1.getdesignation(desig);
System.out.print("Enter your basic pay (annualy):");
int basicpay=sc.nextInt();
System.out.print("Enter how many years you areworking :");
int month=sc.nextInt();
double sal=r1.salary(basicpay,month);
r1.displayfullname(fname,lname,desig,depart);
System.out.println("Salary is " +sal); }
else if(l==2)
{ contract_Employee c1=new contract_Employee();
System.out.print("Enter the department :");
depart=sc1.nextLine();
c1.getdepartment(depart);
System.out.print("Enter your designation :");
desig=sc1.nextLine();
c1.getdesignation(desig);
System.out.print("Enter your basic pay(monthly) :");
int basicpay=sc.nextInt();
System.out.print("Enter how many months you are working");
int month=sc.nextInt();
double sal=c1.salary(basicpay,month);
c1.displayfullname(fname,lname,desig,depart);
System.out.println("Salary is "+sal); }
else
{ System.out.println("Invalid input");
}
}
}

