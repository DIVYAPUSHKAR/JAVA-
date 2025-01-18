import java.util.*;
class circle
{
    double rad;
    circle(double rad)
    {
        this.rad=rad;
    }
    void area()
    {
        System.out.println("Area of circle = "+Math.PI*rad*rad);
    }
    void primeter()
    {
        System.out.println("Perimeter of cicle = "+Math.PI*2*rad);
    }
    void volume()
    {
        System.out.println("volume does not exist as it is 2-d shape");
    }
}
class cylinder extends circle
{
    double height;
    cylinder(double rad,double height)
    {
        super(rad);
        this.height=height;
    }
    void area()
    {
        System.out.println("total surface area ="+ (Math.PI*2*rad*height + 2*Math.PI*rad*rad));
    }
    void volume()
    {
        System.out.println("volume = "+(height*Math.PI*rad*rad));
    }
}

class cone extends circle
{
    double height;
    double l;
    cone(double rad,double height,double l)
    {
        super(rad);
        this.height=height;
        this.l=l;
    }
    void area()
    {
        area(rad,l,height);
    }
    void volume()
    {
        volume(rad,height);
    }
    void area(double rad,double l,double height)
    {
        System.out.println(" area of come = "+(Math.PI*rad*height+Math.PI*rad*l));
    }
    void volume(double rad,double height)
    {
        System.out.println("Volume of cone = "+((1/3)*Math.PI*rad*rad*height));
    }
}


public class polymorphism {

    public static void main(String arhgs[])
    {
        cylinder c1 = new cylinder(7,10);
        c1.area();
        c1.volume();
        cone c2 = new cone(7,9,10);
        c2.area();
        c2.volume();

    }
    
}
