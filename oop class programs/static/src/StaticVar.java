
import java.util.Scanner;

public class StaticVar {
 
   int rollno;//instance variable  
   String name;  
   static String college ="RGUKT";//static variable  
   //constructor  
 StaticVar(int r, String n){  
   rollno = r;  
   name = n;  
   }  
   //method to display the values  
   void display (){System.out.println(rollno+" "+name+" "+college);}  
}  
 
 class TestStaticVariable1{  
 public static void main(String args[]){  
     Scanner s=new Scanner(System.in);
           
          int  r=s.nextInt();
          String n=s.next();

         
               int r1=s.nextInt();
     String n1=s.next();
StaticVar s1 = new StaticVar(r,n);  
StaticVar s2 = new StaticVar(r1,n1);  
 s1.display();  
 s2.display();  
 }  
}  


