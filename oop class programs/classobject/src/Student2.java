
import java.util.Scanner;

/*There are 3 ways to initialize object in Java.

By reference variable
By method
By constructor*/
public class Student2 {

 int id;  
 String name;  
}  
class TestStudent2{  
 public static void main(String args[]){  
  Student s1=new Student();  
  Scanner s=new Scanner(System.in);
  System.out.println("enter name and id");
   s1.name=s.nextLine();
  s1.id=s.nextInt();  
   
  
  System.out.println(s1.name+" "+s1.id);//printing members with a white space  
 
}  
}
