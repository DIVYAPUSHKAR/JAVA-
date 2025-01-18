
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RGUKT
 */
public class VeccontainsAll {

  
    public static void main(String args[])
    {
        // Creating an empty Vector
        Vector<String> vec_tor = new Vector<String>();
  
        // Use add() method to add elements into the Vector
        vec_tor.add("Welcome");
        vec_tor.add("To");
        vec_tor.add("rgukt");
      
  
        // Displaying the Vector
        System.out.println("Vector: " + vec_tor);
  
        // Creating another empty Vector
        Vector<String> v1 = new Vector<String>();
  
   v1.add("Welcome");
   
        v1.add("rgukt");
  
        System.out.println("Are all the contents equal? " + vec_tor.containsAll(v1));
  
        // Creating another empty Vector
          Vector<Integer> v2= new Vector<Integer>();
          Scanner s=new Scanner(System.in);
          System.out.println("add the elements into vector");
                    for(int i=0;i<5;i++)
          {
         v2.add(s.nextInt());  
          }
            System.out.println(v2);
            Collections.sort(v2);  
            System.out.println(v2);
            

            
            
          
    }
}

