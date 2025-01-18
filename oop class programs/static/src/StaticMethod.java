/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RGUKT
 */
public class StaticMethod {
      static int num = 100;
    static String str = "ece";
  String college="rgukt";
    // This is Static method
    static void display()
    { str="cse";
       
  
    }
  
    void show()
    {
        System.out.println(college);
        System.out.println("static number is " + num);
          System.out.println("static string is " + str);
    }
  
    public static void main(String args[])
    {display();
     StaticMethod s=new StaticMethod();
     s.show();
    }
    
      static{  
  System.out.println("static block is invoked");  
 
  }  
    }