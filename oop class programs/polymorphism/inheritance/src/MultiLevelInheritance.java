/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RGUKT
 */
public class MultiLevelInheritance {
     void methodX()
   {
     System.out.println("Class X method");
   }
}
class Y extends MultiLevelInheritance 
{
 void methodY()
{
System.out.println("class Y method");
}
}
class Z extends Y
{
    void methodZ()
   {
     System.out.println("class Z method");
   }
   public static void main(String args[])
   {
     Z obj = new Z();
     obj.methodX(); //calling grand parent class method
     obj.methodY(); //calling parent class method
     obj.methodZ(); //calling local method
  }
}
