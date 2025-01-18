class Throws2
{
  static void display() throws ArithmeticException
  {  
    System.out.println("throws example");
    throw new ArithmeticException("throwing arithmetic exception");
  }

  public static void main(String args[])
  {
    try
    {
      display();
    }
    catch(ArithmeticException e)
    {
      System.out.println("caught" + e);
    }
  }
}