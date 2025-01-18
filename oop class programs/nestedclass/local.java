public class local{  
 private int data=30;//instance variable  
 void display(){  
  class In{  
   void msg(){System.out.println(data);}  
  }  
  In l=new In();  
  l.msg();  
 }  
 public static void main(String args[]){  
  local obj=new local();  
  obj.display();  
 }  
}  
