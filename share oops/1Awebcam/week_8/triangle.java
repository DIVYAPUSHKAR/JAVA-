package org.shapes;
public class triangle 
{
    public float base;
    public float h;
    public triangle(float b,float h)
    {
        this.base=b;
        this.h=h;
    }
    public void area()
    {
        System.out.println("the area of triangle is "+ (0.5f*base*h));
    }

}