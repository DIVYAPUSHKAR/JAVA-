abstract class student{  
  abstract void message();  
}  
class Anonymous{  
 public static void main(String args[]){  
  student p=new student(){  
  void message(){System.out.println("welcome");}  
  };  
  p.message();  
 }  
}  
