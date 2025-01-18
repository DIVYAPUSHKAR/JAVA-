
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RGUKT
 */
public class SumOfElements {

   public static void main(String args[]){
      System.out.println("Enter the required size of the array :: ");
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int myArray[] = new int [n];
      int sum = 0;
      System.out.println("Enter the elements of the array one by one ");

      
      for(int i=0; i<n; i++){
         myArray[i] = s.nextInt();
         sum = sum + myArray[i];
      }
   
      System.out.println("Sum of the elements of the array ::"+sum);
   }
}   

