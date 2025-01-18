/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgthis;

/**
 *
 * @author RGUKT
 */
public class ThisMethod {
    
void m(){System.out.println("this  method declared in class");}  
void n(){  System.out.println("hello world");  
this.m();  
}  
}  
class TestThis4{  
public static void main(String args[]){  
ThisMethod a=new ThisMethod();  
a.n();  
}} 

