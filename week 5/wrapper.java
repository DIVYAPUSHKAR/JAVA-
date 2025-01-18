import java.util.Scanner;

public class wrapper{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: Using Integer wrapper class
        System.out.print("Enter an integer value: ");
        int intValueFromUser = scanner.nextInt();
        Integer intObj = Integer.valueOf(intValueFromUser);

        System.out.println("\nExample 1:");
        System.out.println("Integer Object: " + intObj);
        System.out.println("Unboxed Integer Value: " + intObj.intValue());

        // Example 2: Using Double wrapper class
        System.out.print("\nEnter a double value: ");
        double doubleValueFromUser = scanner.nextDouble();
        Double doubleObj = Double.valueOf(doubleValueFromUser);

        System.out.println("\nExample 2:");
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Unboxed Double Value: " + doubleObj.doubleValue());

        // Example 3: Using Boolean wrapper class
        System.out.print("\nEnter a boolean value (true/false): ");
        boolean boolValueFromUser = scanner.nextBoolean();
        Boolean boolObj = Boolean.valueOf(boolValueFromUser);

        System.out.println("\nExample 3:");
        System.out.println("Boolean Object: " + boolObj);
        System.out.println("Unboxed Boolean Value: " + boolObj.booleanValue());

        // Example 4: Using Character wrapper class
        System.out.print("\nEnter a character: ");
        char charValueFromUser = scanner.next().charAt(0);
        Character charObj = Character.valueOf(charValueFromUser);

        System.out.println("\nExample 4:");
        System.out.println("Character Object: " + charObj);
        System.out.println("Unboxed Character Value: " + charObj.charValue());

        // Example 5: Autoboxing and Autounboxing
        System.out.print("\nEnter an integer for autoboxing: ");
        int autoboxedValueFromUser = scanner.nextInt();
        Integer autoboxedValue = autoboxedValueFromUser; // Autoboxing

        System.out.println("\nExample 5:");
        System.out.println("Autoboxing: " + autoboxedValue);
        System.out.println("Autounboxing: " + autoboxedValue.intValue());

       
    }
}

