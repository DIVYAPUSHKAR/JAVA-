/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RGUKT
 */
public class superVehicle {
    int maxSpeed = 120;
}
  
class Car extends superVehicle
{
    int maxSpeed = 180;
  
    void display()
    {
              System.out.println("Maximum Speed: " + super.maxSpeed);
    }
}
  
/* Driver program to test */
class Test
{
    public static void main(String[] args)
    {
        Car s = new Car();
        s.display();
    }
} 

