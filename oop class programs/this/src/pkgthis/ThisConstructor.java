/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgthis;

/**
 *
 * @author RGUKT
 */
public class ThisConstructor {

ThisConstructor(){System.out.println("good morning");}  
ThisConstructor(int b){  
this();  
System.out.println(b+200);  
}  
}  
class TestThis5{  
public static void main(String args[]){  
ThisConstructor a=new ThisConstructor(100);  
}}  

