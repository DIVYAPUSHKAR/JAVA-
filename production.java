import java.util.Scanner;

class DataProducer {
    private volatile boolean isDataProduced = false;

    public synchronized void produceData() {
        
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isDataProduced = true;
        notify(); // Notify waiting threads that data has been produced
    }

    public synchronized boolean isDataProduced() {
        return isDataProduced;
    }
}

class ConsumerThread extends Thread {
    private final DataProducer dataProducer;

    public ConsumerThread(DataProducer dataProducer) {
        this.dataProducer = dataProducer;
    }

    public void run() {
        while (!dataProducer.isDataProduced()) {
            try {
                Thread.sleep(10); // Check every 10 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Data production is complete.");
    }
}

 class production {
    public static void main(String[] args) {
        DataProducer dataProducer = new DataProducer();
        ConsumerThread consumerThread = new ConsumerThread(dataProducer);

        
        consumerThread.start();

       
        System.out.println("Press Enter to start data production...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        
        dataProducer.produceData();
        
       
    }
}

