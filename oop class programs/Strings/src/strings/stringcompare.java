/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

/**
 *
 * @author RGUKT
 */
public class stringcompare {
     public static void main(String args[]){  
   String s1="latha";  
   String s2="latha";  
   String s3=new String("latha");  
   String s4="reddy";  
   String s5="Latha";
   String s6="sathya";
    String s7="ram";
   //1)equals()
   System.out.println(s1.equals(s2));//true  
   System.out.println(s1.equals(s3));//true  
   System.out.println(s1.equals(s4));//false  
   //2)==
     System.out.println(s1==s2);//true  
   System.out.println(s1==s3);//false 
   //3)equalsIgnoreCase
       System.out.println(s1.equalsIgnoreCase(s5));//true  
         System.out.println(s1.compareTo(s2));
   System.out.println(s1.compareTo(s4));
   System.out.println(s6.compareTo(s7)); 
 }  
    
}
