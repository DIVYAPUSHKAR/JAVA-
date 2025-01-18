import org.shapes.circle;
import org.shapes.square;
import org.shapes.triangle;

class question2
{
    public static void main(String args[])
    {
        square s= new square(12.3f);
        s.area();
        triangle t= new triangle(12f,7f);
        t.area();
        circle c= new circle(7f);
        c.area();

    }
}
