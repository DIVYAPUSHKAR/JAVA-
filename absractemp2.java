import java.util.Scanner;

abstract class Employee {
    abstract double getAmount();
}

class WeeklyEmployee extends Employee {
    private int totalWeeks;
    private double weeklySalary;

    public WeeklyEmployee(int totalWeeks, double weeklySalary) {
        this.totalWeeks = totalWeeks;
        this.weeklySalary = weeklySalary;
    }

    @Override
    double getAmount() {
        return totalWeeks * weeklySalary;
    }
}

class HourlyEmployee extends Employee {
    private int totalHours;
    private double hourlyRate;

    public HourlyEmployee(int totalHours, double hourlyRate) {
        this.totalHours = totalHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double getAmount() {
        return totalHours * hourlyRate;
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for WeeklyEmployee
        System.out.print("Enter total weeks worked for Weekly Employee: ");
        int www= scanner.nextInt();
        System.out.print("Enter weekly salary for Weekly Employee: ");
        double ws= scanner.nextDouble();

        // Create an instance of WeeklyEmployee
        WeeklyEmployee we = new WeeklyEmployee(www, ws);

        // Get user input for HourlyEmployee
        System.out.print("Enter total hours worked for Hourly Employee: ");
        int hoursWorkedHourly = scanner.nextInt();
        System.out.print("Enter hourly rate for Hourly Employee: ");
        double hourlyRate = scanner.nextDouble();

        // Create an instance of HourlyEmployee
        HourlyEmployee hourlyEmployee = new HourlyEmployee(hoursWorkedHourly, hourlyRate);

        // Display results
        System.out.println("Amount for Weekly Employee: " + we.getAmount());
        System.out.println("Amount for Hourly Employee: " + hourlyEmployee.getAmount());
    }
}

