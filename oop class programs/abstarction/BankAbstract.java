/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstarction;

/**
 *
 * @author RGUKT
 */
 public abstract class BankAbstract {
 
abstract int getRateOfInterest();    
}    
class SBI extends  BankAbstract{    
int getRateOfInterest(){return 7;}    
}    
class PNB extends  BankAbstract{    
int getRateOfInterest(){return 8;}    
}    
    
class TestBank{    
public static void main(String args[]){    
 BankAbstract b;  
b=new SBI();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
b=new PNB();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
}}   

