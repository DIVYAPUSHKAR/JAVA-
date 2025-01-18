class FinallyBlock
{
  public static void main(String[] args)
  {
System.out.println("hai");
    int a[] = new int[2];

    try
    {
      System.out.println("Access invalid element"+ a[3]);
  
    }
/*catch(Exception e)
{
System.out.println("handled");
}*/

    finally
    {
      System.out.println("finally is always executed.");
    }
System.out.println("good");
  }
}