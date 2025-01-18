/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author RGUKT
 */
public class string {
    public static void main(String ar[])
    { char ch[]={'j','a','v','a'};
    String str=new String(ch);
    System.out.println(str);
        String s1="Welcome";  
String s2=new String("welcome to rgukt");
System.out.println(s2);
System.out.println(s1);
String s3;
System.out.println("enter a string");
Scanner s=new Scanner(System.in);
s3=s.nextLine();
System.out.println(s3);
String s4="Latha,";  
   s4.concat(" Assistant Professor");//concat() method appends the string at the end  
   System.out.println(s4);//will print Latha because strings are immutable objects  
   s4=  s4.concat(" Assistant Professor");
 System.out.println(s4);
 for(int i=s1.length()-1;i>=0;i--)
 {
     System.out.print(s1.charAt(i));
     
    }
    }
}
    

