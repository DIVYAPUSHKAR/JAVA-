package mypackage;
import mypackage.circle;
import mypackage.rectangle;
import mypackage.triangle;

import java.util.*;
class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       

      

        
            System.out.print("Enter the length of the rectangle: ");
            double length = s.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = s.nextDouble();
            
            rectangle obj = new rectangle(length, width);
            System.out.println("Area of the rectangle: " + obj.area());

       
            System.out.print("Enter the radius of the circle: ");
            double radius = s.nextDouble();
            
            circle a = new circle(radius);
            System.out.println("Area of the circle: " + a.area());

       
            System.out.print("Enter the length of the triangle: ");
            double l = s.nextDouble();
            System.out.print("Enter the width of the base: ");
            double base = s.nextDouble();
         
           triangle b = new triangle(l, base);
            System.out.println("Area of the triangle: " + b.area()); 
    }
}

