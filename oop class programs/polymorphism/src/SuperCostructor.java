public class SuperCostructor {
    
    SuperCostructor()
    {
        System.out.println("Person class Constructor");
    }
}
class Student extends SuperCostructor
{
    Student()
    {
        // invoke or call parent class constructor
        super();
  
        System.out.println("Student class Constructor");
    }
}

class Sample
{
    public static void main(String[] args)
    {
        Student s = new Student();
    }
}
