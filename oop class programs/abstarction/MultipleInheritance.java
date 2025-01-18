/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstarction;

interface A{  
void print();  
}  
interface B{  
void display();  
}  
class A7 implements A,B{  
public void print(){System.out.println("Hello");}  
public void display(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
A7 obj = new A7();  
obj.print();  
obj.display();  
 }  
}  
/*interface A{  
void print();  
}  
interface B{  
void print();  
}  
  
class Test implements A,B{  
public void print(){System.out.println("Hello");}  
public static void main(String args[]){  
Test obj = new Test();  
obj.print();  
 }  
}  */