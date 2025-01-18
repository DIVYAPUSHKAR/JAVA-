import java.util.Scanner;


class MyCustomException extends Exception {
    private String message;

    // Constructor that takes a String argument and stores it
    public MyCustomException(String message) {
        this.message = message;
    }

    // Method to print out the stored String
    public void printStoredMessage() {
        System.out.println("Stored Message: " + message);
    }
}

 class custom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Enter a value: ");
            String a = sc.nextLine();

            
            if (a.equals("trigger")) {
                throwCustomException();
            } else {
                System.out.println("No exception triggered. Entered value: " + a);
            }

        } catch (MyCustomException e) {
            // Catch the custom exception and print the stored message
            System.out.println("Caught MyCustomException: " + e.getMessage());
            e.printStoredMessage();
        } finally {
            
            System.out.println("Finally block executed");
        }
    }

    // Method that throws the custom exception
    private static void throwCustomException() throws MyCustomException {
        // Creating an instance of MyCustomException with a String argument
        throw new MyCustomException("This is a custom exception message");
    }
}

