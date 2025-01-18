
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RGUKT
 */
public class Account {

int acc_no;  
String name;  
float amount;  
//Method to initialize object  
void insert(int a,String n,float amt){  
acc_no=a;  
name=n;  
amount=amt;  
}  
//deposit method  
void deposit(float amt){  
amount=amount+amt;  
System.out.println(amt+" deposited");  
}  
//withdraw method  
void withdraw(float amt){  
if(amount<amt){  
System.out.println("Insufficient Balance");  
}else{  
amount=amount-amt;  
System.out.println(amt+" withdrawn");  
}  
}  
//method to check the balance of the account  
void checkBalance(){System.out.println("Balance is: "+amount);}  
//method to display the values of an object  
void display(){System.out.println(acc_no+" "+name+" "+amount);}  
}  
//Creating a test class to deposit and withdraw amount  
class TestAccount{  
public static void main(String[] args){  
Account a1=new Account();  
a1.insert(123456,"Anu",2000);  
a1.display();  
a1.checkBalance();  
a1.deposit(50000);  
a1.checkBalance();  
System.out.println("enter the withdrawl amount");
Scanner s3=new Scanner(System.in);
float a=s3.nextFloat();
a1.withdraw(a); 
 a1.checkBalance();  
}}   

