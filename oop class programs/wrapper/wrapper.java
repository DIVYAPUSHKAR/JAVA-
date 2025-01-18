/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wrapper;

/**
 *
 * @author RGUKT
 */
public class wrapper {

  public static void main(String[] args) { 
    Integer obj=5; 

    int c=obj.intValue();//un boxing
 
    System.out.println(c);
    
   //auto  boxing
   int a=10;
   Integer b=a;
   System.out.println(b);
   //Integer x=Integer.valueOf(a);
      //System.out.println(x);
  }
}


