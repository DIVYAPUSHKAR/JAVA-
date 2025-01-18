package org.shapes;
public class circle 
{
    public float r;
    public circle(float r)
    {
        this.r=r;
    }
    public void area()
    {
        System.out.println("the area of square is "+ (2*Math.PI*r));
    }

}