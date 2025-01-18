import java.util.Scanner;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Enter a number: ");
            int a=sc.nextInt();
            
            if (a < 0) {
                throw new MyException("Negative numbers are not allowed");
            }

            System.out.println("You entered a non-negative number: " + a);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } catch (MyException e) {

            System.out.println("Caught custom exception: " + e.getMessage());
        } finally {
           
            System.out.println("Finally block executed");
        }
    }
}

