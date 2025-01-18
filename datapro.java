import java.util.Scanner;

class DataProducer implements Runnable {
    private int dataItemCount;

    // Constructor to initialize the dataItemCount
    public DataProducer(int dataItemCount) {
        this.dataItemCount = dataItemCount;
    }

    // Overridden run method to simulate data production
    @Override
    public void run() {
        for (int i = 1; i <= dataItemCount; i++) {
            System.out.println("Producing data item: " + i);
            try {
                // Simulating data production time
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DataConsumer implements Runnable {
    private boolean isDataProductionOver;
    private DataProducer dataProducer;

    // Constructor to initialize the shared variables
    public DataConsumer(DataProducer dataProducer) {
        this.isDataProductionOver = false;
        this.dataProducer = dataProducer;
    }

    // Method to check data production status every 10 ms
    public void checkDataProductionStatus() {
        while (!isDataProductionOver) {
            try {
                // Check status every 10 ms
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Data production is over. Consuming data...");
    }

    // Overridden run method
    @Override
    public void run() {
        // Start the consumer thread to check data production status
        checkDataProductionStatus();
    }

    // Method to set the data production status
    public void setDataProductionOver(boolean isDataProductionOver) {
        this.isDataProductionOver = isDataProductionOver;
    }
}

public class datapro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter the number of data items to produce
            System.out.print("Enter the number of data items to produce: ");
            int dataItemCount = scanner.nextInt();

            // Create an instance of DataProducer
            DataProducer dataProducer = new DataProducer(dataItemCount);

            // Create an instance of DataConsumer with the reference to the DataProducer
            DataConsumer dataConsumer = new DataConsumer(dataProducer);

            // Create threads for DataProducer and DataConsumer
            Thread producerThread = new Thread(dataProducer);
            Thread consumerThread = new Thread(dataConsumer);

            // Start the threads
            producerThread.start();
            consumerThread.start();

            // Wait for the producer thread to finish producing data
            producerThread.join();

            // Set the data production status to true
            dataConsumer.setDataProductionOver(true);

            // Wait for the consumer thread to finish
            consumerThread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

