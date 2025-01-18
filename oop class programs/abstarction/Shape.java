/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstarction;

public abstract class Shape {

    abstract void draw();  
}  

class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shape{  
void draw(){System.out.println("drawing circle");}  
}  

class TestAbstraction1{  
public static void main(String args[]){  
Shape s=new Circle1();
s.draw();  
}  
   
    
}
