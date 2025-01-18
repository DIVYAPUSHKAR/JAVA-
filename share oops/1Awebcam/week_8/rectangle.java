package outer.inner;
public class rectangle
{
    float l,b;
    public rectangle(float l,float b)
    {
        this.l=l;
        this.b=b;
    }
    public void area()
    {
        System.out.println("area of rectangle = "+ l*b );
    }
}