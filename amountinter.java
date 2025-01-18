import java.util.Scanner;

interface Fare {
    double getAmount();
}

class Bus implements Fare {
    private double distance;
    private double farePerKilometer;

    public Bus(double distance, double farePerKilometer) {
        this.distance = distance;
        this.farePerKilometer = farePerKilometer;
    }

    @Override
    public double getAmount() {
        return distance * farePerKilometer;
    }
}

class Train implements Fare {
    private double distance;
    private double farePerKilometer;

    public Train(double distance, double farePerKilometer) {
        this.distance = distance;
        this.farePerKilometer = farePerKilometer;
    }

    @Override
    public double getAmount() {
        return distance * farePerKilometer;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for Bus fare
        System.out.print("Enter distance traveled by Bus (in kilometers): ");
        double distanceBus = scanner.nextDouble();
        System.out.print("Enter fare per kilometer for Bus: ");
        double farePerKilometerBus = scanner.nextDouble();

        // Create an instance of Bus
        Bus bus = new Bus(distanceBus, farePerKilometerBus);

        // Get user input for Train fare
        System.out.print("Enter distance traveled by Train (in kilometers): ");
        double distanceTrain = scanner.nextDouble();
        System.out.print("Enter fare per kilometer for Train: ");
        double farePerKilometerTrain = scanner.nextDouble();

        // Create an instance of Train
        Train train = new Train(distanceTrain, farePerKilometerTrain);

        // Display results
        System.out.println("\nFare for Bus: $" + bus.getAmount());
        System.out.println("Fare for Train: $" + train.getAmount());
    }
}

