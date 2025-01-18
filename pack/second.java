package mypack;
import mypack.circle;
import mypack.rectangle;

import java.util.*;
class second {
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
            }
            }
           

       
