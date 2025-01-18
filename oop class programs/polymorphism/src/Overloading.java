/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RGUKT
 */
//1.changing the no.of arguements
/*public class Overloading {
    int add(int a,int b){
        return a+b;}  
int add(int a,int b,int c){
    return a+b+c;}  
}  
class Test{  
public static void main(String[] args){  
    Overloading o=new Overloading();
System.out.println(o.add(90,10));  
System.out.println(o.add(100,10,200));  
}
}*/
//2.changing data type of arguments
public class Overloading {
    int add(int a,int b){
        return a+b;}  
float add(float a,float b){
    return a+b;}  
}  
class Test{  
public static void main(String[] args){  
    Overloading o=new Overloading();
System.out.println(o.add(90,10));  
System.out.println(o.add(10.4f,10.5f));  
}
}
