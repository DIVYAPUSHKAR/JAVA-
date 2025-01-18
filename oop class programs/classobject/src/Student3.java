import java.util.*;
public class Student3 {

 int rollno;  
 String name;  
 void insertRecord(int r, String n){  
  rollno=r;  
  name=n;  
 }  
 void displayInformation(){
     System.out.println(rollno+" "+name);
 }  
}  
class Student33{  
 public static void main(String args[]){  
  Student3 s1=new Student3();  
  Student3 s2=new Student3();  
Scanner s =new Scanner(System.in);

String n=s.nextLine();
int a=s.nextInt();


  s1.insertRecord(a,n);  
  s2.insertRecord(200,"arjun");  
  s1.displayInformation();  
  s2.displayInformation();  
 }  
}   

