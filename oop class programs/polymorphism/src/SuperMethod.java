/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RGUKT
 */
//2) super can be used to invoke parent class method
public class SuperMethod {
      void message()
    {
        System.out.println("This is super class message");
    }
}
  
/* Subclass Student */
class Student extends SuperMethod 
{
    void message()
    {
        System.out.println("This is student class");
    }
  
    void display()
    {
        message();
  
               super.message();
    }
}

class Test
{
    public static void main(String args[])
    {
        Student s = new Student();
  
        // calling display() of Student
        s.display();
    }
}

