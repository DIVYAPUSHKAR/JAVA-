import java.util.Scanner;

class Book {
    String bookName;
    String bookAuthor;
    int bookCount;

    Book(String name, String author, int count) {
        bookName = name;
        bookAuthor = author;
        bookCount = count;
    }

    String getBookName() {
        return bookName;
    }

    String getBookAuthor() {
        return bookAuthor;
    }

    int getBookCount() {
        return bookCount;
    }

    void decrementBookCount() {
        if (bookCount > 0) {
            bookCount--;
        } else {
            System.out.println("Sorry, the book is out of stock.");
        }
    }
}

class Customer {
    int customerId;
    String customerName;
    String customerAddress;

    Customer(int id, String name, String address) {
        customerId = id;
        customerName = name;
        customerAddress = address;
    }

    int getCustomerId() {
        return customerId;
    }

    String getCustomerName() {
        return customerName;
    }

    String getCustomerAddress() {
        return customerAddress;
    }
}

public class ebookstall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the book details
        System.out.println("Enter Book Details:");
        System.out.print("Book Name: ");
        String bookName = scanner.nextLine();
        System.out.print("Book Author: ");
        String bookAuthor = scanner.nextLine();
        System.out.print("Book Count: ");
        int bookCount = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        // Create a book using user input
        Book textbook = new Book(bookName, bookAuthor, bookCount);

        // Take input for the customer details
        System.out.println("\nEnter Customer Details:");
        System.out.print("Customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.print("Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Customer Address: ");
        String customerAddress = scanner.nextLine();

        // Create a customer using user input
        Customer obj= new Customer(customerId, customerName, customerAddress);

        // Display initial book details
        displayBookDetails(textbook);

        // Simulate the customer buying a textbook
        System.out.println("\nCustomer " +obj.getCustomerName() + " is buying a textbook.");
        textbook.decrementBookCount();

        // Display updated book details after the purchase
        displayBookDetails(textbook);

       
    }

    private static void displayBookDetails(Book book) {
        System.out.println("\nBook Details:");
        System.out.println("Name: " + book.getBookName());
        System.out.println("Author: " + book.getBookAuthor());
        System.out.println("Remaining Count: " + book.getBookCount());
    }
}

