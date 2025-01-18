
import java.util.Collections;
import java.util.Vector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RGUKT
 */
public class Vec {
    
    public static void main(String[] args)
    {
      
        
  Vector  v = new Vector(5);

            v.add(10);
            v.add(20);
            v.add(30);
            v.add(40);
            v.add(50);
            v.add("basar");
            v.addElement("iiit");
            v.add(30);
         
        // Printing elements
        System.out.println(v);
 
        // Remove element at index 3
        v.remove(3);
 
        // Displaying the vector
        // after deletion
        System.out.println(v);
 System.out.println("capacity"+v.capacity());
 System.out.println("size"+v.size());
 System.out.println("first element"+v.firstElement());
 System.out.println("lastelement"+v.lastElement());
 System.out.println("index of first occurance:"+v.indexOf(30));
 v.insertElementAt("H", 4);
  System.out.println("elements are:"+v);
 v.add(6,"Hello");
 v.add("rgukt");
 v.add("Hello");
 v.add(70);
  System.out.println("The Object that is replaced is: "
                           + v.set(4, "hai"));
  System.out.println("last occurance of element"+v.lastIndexOf("Hello"));
         v.removeElementAt(2);
        // iterating over vector elements
        // using for loop
        for (int i = 0; i < v.size(); i++)
 
            // Printing elements one by one
            System.out.print(v.get(i) + " ");
          
  
    }
    
    
}
