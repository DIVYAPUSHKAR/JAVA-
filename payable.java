import java.util.Scanner;

interface Payable {                                          // this is public and abstract
    double getAmount();
}

class Invoice implements Payable {
    private String invoiceNumber;
    private double amount;

    public Invoice(String invoiceNumber, double amount) {                     //total amount read =total amount +additional charge
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

class Employee implements Payable {
    private String employeeId;
    private double salary;

    public Employee(String employeeId, double salary) {
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public double getAmount() {
        return salary;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for Invoice
        System.out.print("Enter Invoice Number: ");
        String invoiceNumber = scanner.next();
        System.out.print("Enter Invoice Amount: ");
        double invoiceAmount = scanner.nextDouble();

        // Create an instance of Invoice
        Invoice invoice = new Invoice(invoiceNumber, invoiceAmount);

        // Get user input for Employee
        System.out.print("Enter Employee ID: ");
        String employeeId = scanner.next();
        System.out.print("Enter Employee Salary: ");
        double employeeSalary = scanner.nextDouble();

        // Create an instance of Employee
        Employee employee = new Employee(employeeId, employeeSalary);

        // Display results
        System.out.println("Amount for Invoice: " + invoice.getAmount());
        System.out.println("Amount for Employee: " + employee.getAmount());
    }
}

