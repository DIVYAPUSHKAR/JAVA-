import java.util.Scanner;

class Book {
    private String bookName;
    private String bookAuthor;
    private int bookCount;

    public Book(String bookName, String bookAuthor, int bookCount) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCount = bookCount;
    }

    public void displayBookDetails() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Count: " + bookCount);
    }

    public void decreaseBookCount() {
        if (bookCount > 0) {
            bookCount--;
            System.out.println("Book purchased successfully!");
        } else {
            System.out.println("Sorry, the book is out of stock.");
        }
    }
}

class Customer {
    private int customerId;
    private String customerName;
    private String customerAddress;

    public Customer(int customerId, String customerName, String customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public void buyBook(Book book) {
        System.out.println("Customer " + customerName + " is buying a book.");
        book.displayBookDetails();
        book.decreaseBookCount();
    }
}

 class EbookStall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for book details
        System.out.println("Enter Book Name:");
        String bookName = scanner.nextLine();

        System.out.println("Enter Book Author:");
        String bookAuthor = scanner.nextLine();

        System.out.println("Enter Initial Book Count:");
        int initialBookCount = scanner.nextInt();

        // Creating a book object with user input
        Book textbook = new Book(bookName, bookAuthor, initialBookCount);

        // Taking user input for customer details
        System.out.println("Enter Customer Name:");
        scanner.nextLine(); // Consume the newline character
        String customerName = scanner.nextLine();

        System.out.println("Enter Customer Address:");
        String customerAddress = scanner.nextLine();

        // Creating a customer object with user input
        Customer customer1 = new Customer(1, customerName, customerAddress);

        // Displaying initial book details
        System.out.println("\nInitial Book Details:");
        textbook.displayBookDetails();
        System.out.println();

        // Customer buys a book
        customer1.buyBook(textbook);

        // Displaying updated book details after purchase
        System.out.println("\nUpdated Book Details:");
        textbook.displayBookDetails();

       
    }
}

