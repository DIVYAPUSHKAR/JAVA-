/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.StringTokenizer;

/**
 *
 * @author RGUKT
 */
public class stringtokenizer {
     public static void main(String args[]){  
         int n;
   StringTokenizer st = new StringTokenizer("good morning class"," ");  
           n= st.countTokens();
                     System.out.println(n); 
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
   
     }  

         }
   }
