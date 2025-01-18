package mypackage;
// class 1
 class circle {
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
        }
     
        }
  //class 2 
   class rectangle {
    private double length;
    private double width;

   public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}
//class 3
class triangle
{
private double l;
private double base;
public triangle(double l,double base)
{
this.l=l;
this.base=base;
}
public double area()
{
return 1/2*l*base;
}
}


