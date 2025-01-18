import java.util.*;

abstract class Shape
{
    abstract void getArea();
    abstract void getVolume();

}
class square extends Shape{
    double side;
    square(double s)
    {
        side=s;
    }

    void getArea()
    {
        System.out.println("area of square = " +side*side);

    }
    void getVolume()
    {
        System.out.println("square dont't have volume");
    }
}
class circle extends Shape
{
    double rad;
    circle(double r)
    {
        rad=r;
    }

    void getArea()
    {
        System.out.println("area of cicle = "+ Math.PI*rad*rad);
    }
    void getVolume()
    {
        System.out.println("square dont't have volume");
    }
}
class cube extends Shape
{
    double side;
    cube(double side)
    {
        this.side=side;
    }
    void getArea()
    {
        System.out.println("area of cicle = "+ 6*side*side);
    }
    void getVolume()
    {
        System.out.println("volume of cube = "+ side*side*side);
    }
}
class sphere extends Shape
{
    double rad;
    sphere(double r)
    {
        rad=r;
    }
    void getArea()
    {
        System.out.println("area of sphere = "+ 4*Math.PI*rad*rad);
    }
    void getVolume()
    {
        System.out.println("volume of sphere = "+ 4/3*Math.PI*rad*rad);
    }
}





public class AbstractShape 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double x;
        System.out.println("enter parameter ");
        x=sc.nextDouble();
        square s= new square(x);
        s.getArea();
        s.getVolume();
        circle c= new circle(x);
        c.getArea();
        c.getVolume();
        cube c1= new cube(x);
        c1.getArea();
        c1.getVolume();
        sphere s1= new sphere(x);
        s1.getArea();
        s1.getVolume();
        sc.close();



    }
}
