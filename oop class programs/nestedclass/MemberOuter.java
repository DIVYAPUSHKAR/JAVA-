class MemberOuter{  
 private int data=30;  
 class Inner{  
  void msg(){System.out.println("data is "+data);}  
 }  
 public static void main(String args[]){  
  MemberOuter obj=new MemberOuter();  
  MemberOuter.Inner in=obj.new Inner();  
  in.msg();  
 }  }
