
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RGUKT
 */
public class parameterized {
     int id;  
    String name;  
    //creating a parameterized constructor  
    parameterized(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
Scanner s=new Scanner(System.in);
String name=s.nextLine();
int a=s.nextInt();
parameterized s1 = new parameterized(a,name);  

    s1.display();  
  
   }  
}
