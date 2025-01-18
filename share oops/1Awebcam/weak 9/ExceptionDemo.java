


class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class ExceptionDemo {
  

    public static void m1() throws Exception{
        throw new MyException("This is a  exception.");
    }
    public static void main(String[] args) {
        try {
           m1();
            // throw new MyException("This is a  exception.");
        } catch (MyException e) {
      
            System.out.println("Caught exception: " + e.getMessage());
        }
        catch( Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        finally {
           
            System.out.println("Finally block executed.");
        }
    }
}

