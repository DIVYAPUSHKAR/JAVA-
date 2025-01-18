import java.util.Scanner;
class cont_ract_Employee
{ String desig;
void getdesignation(String desig)
{ this.desig=desig; } }
class hourly_employee
{ int hours,wageperhour,s;
float sal2;
float calculateWage(int hours,int wageperhour)
{ s=(wageperhour*hours)*52;
sal2=s/12; return sal2; } }
class week_employee
{ int wageperweek,s,week;
float sal3;
float calculateWage(int week,int wageperweek)
{ s=wageperweek*52;
sal3=s/12;
return sal3; } }
class employee_t { public static void main(String args[]){ Scanner sc=new
Scanner(System.in);
Scanner sc1=new Scanner(System.in);
cont_ract_Employee q1=new cont_ract_Employee();
System.out.print("Enter your designation:");
String desig=sc1.nextLine();
q1.getdesignation(desig);
System.out.println("Enter\n1:Weekly employee\n2:HourlyEmployee");
int op=sc.nextInt();
if(op==1)
{ week_employee w1=new week_employee();
System.out.print("Enter number of weeks you are working:");
int week=sc.nextInt();
System.out.print("Enter the salary (Weekly):");
int wageperweek=sc.nextInt();
float d=w1.calculateWage(week,wageperweek);System.out.print("Monthly Salary of the employee is "+d); }
else
{ hourly_employee h1=new hourly_employee();
System.out.print("Enter number of hours you are working in a week:");
int hours=sc.nextInt();
System.out.print("Enter the salary (hourly):");
int wageperhour=sc.nextInt();
float h=h1.calculateWage(hours,wageperhour);
System.out.print("Monthly Salary of the employee is "+h);
}
}
}

