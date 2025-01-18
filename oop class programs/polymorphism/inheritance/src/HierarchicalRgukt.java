/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RGUKT
 */
public class HierarchicalRgukt{
   
void branch(){System.out.println("displaying the branches in rgukt");}  
}  
class cse extends HierarchicalRgukt{  
void displayCse(){System.out.println("this is cse branch");}  
}  
class ece extends HierarchicalRgukt{  
void displayEce(){System.out.println("this is ece");}  
}  
    class civil extends HierarchicalRgukt{  
void displayCivil(){System.out.println("this is civil");}  
}      
class TestInheritance3{  
public static void main(String args[]){  
ece e=new ece();  
civil c=new civil();
cse s=new cse();
s.branch();
s.displayCse();
//s.displayEce();
}}   

