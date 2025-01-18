import java.util.Scanner;

 class numberformat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Enter a number as a string: ");
            String a = sc.nextLine();

            
            int convertedNumber = Integer.parseInt(a);

            System.out.println("Converted number: " + convertedNumber);

        } catch (NumberFormatException e) {
                                                               // Catch NumberFormatException and handle it
            System.out.println("Error: Invalid number format - " + e.getMessage());
        } catch (Exception e) {
                                                             // Catch any other exceptions
            System.out.println("Error: " + e.getMessage());
        } finally {
            
            System.out.println("Finally block executed");
        }
    }
}

