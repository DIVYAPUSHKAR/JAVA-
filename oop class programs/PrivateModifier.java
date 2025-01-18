/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RGUKT
 */
 public class PrivateModifier  {
   private int a=100;  
 private void display(){System.out.println("Hello java");}  
}  
  
 class A {  
 public static void main(String args[]){  
 PrivateModifier obj=new PrivateModifier();  
   System.out.println(obj.a); 
   obj.display();
   }  
}  

