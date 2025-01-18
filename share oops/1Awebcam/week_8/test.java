 import outer.square1;
 import outer.inner.rectangle;
   
 class test
 {
    public static void main(String args[])
    {
        square1 s= new square1(12f);
        s.area();
        rectangle r= new rectangle(12f,7f);
        r.area();
    }
 }