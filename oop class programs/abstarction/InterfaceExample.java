/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstarction;

/**
 *
 * @author RGUKT
 */
interface Drawable{  
void draw();  
}  

class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class Circle implements Drawable{  
public void draw(){System.out.println("drawing circle");}  
}  

class TestInterface1{  
public static void main(String args[]){  
Drawable d=new Circle();
d.draw();  
}}  
    

