import java.util.Scanner;


class CUSTOM extends Exception {
     String message;

    
   CUSTOM (String message) {
        this.message = message;
    }

    
  public  void mom() {
        System.out.println("Stored Message: " + message);
    }
}

 class custom1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Enter a value: ");
            String a = sc.nextLine();

            
            if (a.equals("trigger")) {
                throwCustomException();
            } else {
                System.out.println("No exception triggered: " + a);
            }

        } catch (CUSTOM e) {
            
            System.out.println("Caught CUSTOM: " + e);
            e.mom();
        } finally {
            
            System.out.println("Finally block executed");
        }
    }

   
    static void throwCustomException() throws CUSTOM {
       
        throw new CUSTOM("This is a custom exception message");
    }
}

