
import java.util.*;

class emp
{
  private String firstname;
  private String lastname;
emp(String firstname,String lastname)
  {
  this.firstname=firstname;
  this.lastname=lastname;
  }
   String getFirstname()
   {
   return firstname;
  }
  
  String getLastname()
  {
  return lastname;
   }
}
class contract extends emp
{
  private String department;
  private String  designation;
  private double salary;
  contract(String firstname,String lastname,String department,String designation,  double salary)
  {
    super(firstname,lastname);
    this.department=department;
    this.designation=designation;
    this.salary=salary;
   }
  String displayFullName()
  { 
    return  getFirstname()+" "+getLastname();
  }
  String getDepartment()
  {
  return department;
  }
  String getDesignation()
  {
  return designation;
  }
  double getSalary()
  {
  return salary;
  }
 }
  
 class regular extends emp
{
  private String department;
  private String  designation;
  private double salary;
  regular(String firstname,String lastname,String department,String designation,double salary)
  {
    super(firstname,lastname);
    this.department=department;
    this.designation=designation;
    this.salary=salary;
   }
  String displayFullName()
  { 
    return  getFirstname()+" "+getLastname();
  }
  
  String getDepartment()
  {
  return department;
  }
  
  String getDesignation()
  {
  return designation;
  }
  
  double getSalary()
  {
  return salary;
  }
}
 
class emptest
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String fn,ln,dept,desig;
    double sal;
    System.out.println("enter the firstname,lastname,dept,desig,salary");
    fn=sc.nextLine();
    ln=sc.nextLine();
    dept=sc.nextLine();
    desig=sc.nextLine();
    sal=sc.nextDouble();
    sc.nextLine();
    contract c=new contract(fn,ln,dept,desig,sal);
    System.out.println("contract employee details");
    System.out.println(" FULL NAME :"+"  "+c.displayFullName());
    System.out.println(" DEPARTMENT :"+"  "+c.getDepartment());
    System.out.println(" DESIGNATION :"+"  "+c.getDesignation());
    System.out.println(" SALARY :"+"  "+c.getSalary());
    
    System.out.println("enter the firstname,lastname,dept,desig,salary");
    fn=sc.nextLine();
    ln=sc.nextLine();
    dept=sc.nextLine();
    desig=sc.nextLine();
    sal=sc.nextDouble();
    sc.nextLine();
    regular r=new regular(fn,ln,dept,desig,sal);
    System.out.println("regular employee details");
    System.out.println(" FULL NAME :"+" "+r.displayFullName());
    System.out.println(" DEPARTMENT :"+" "+r.getDepartment());
    System.out.println(" DESIGNATION :"+" "+r.getDesignation());
    System.out.println(" SALARY :"+" "+r.getSalary());
    }
   }
    
   
