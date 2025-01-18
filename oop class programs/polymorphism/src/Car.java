/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RGUKT
 */
public class Car {

void run() 
{ 
System.out.println("running"); 
} 
}
class innova extends Car 
{ 
void run()
{ 
System.out.println("running fast at 120km"); 
}
public static void main(String args[]) 
{ 
Car c = new innova(); 
c.run(); 
} 
}   

