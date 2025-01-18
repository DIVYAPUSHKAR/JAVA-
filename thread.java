//Write a program to create MyThread class with run() method and then attach a thread tothis MyThread


import java.util.Scanner;

class MyThread extends Thread {
    private int count;

    // Constructor to initialize the count
    public MyThread(int count) {
        this.count = count;
    }

    // Overridden run method
    
    public void run() {
        for (int i = 1; i <= count; i++) {
            System.out.println("Thread is running: " + i);
            try {
                // Simulating some work being done by the thread
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class thread{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Enter the number of times the thread should run: ");
            int n= sc.nextInt();

            // Create an instance of MyThread
            MyThread myThread = new MyThread(n);

            // Attach a thread to the MyThread object
            Thread thread = new Thread(myThread);

            // Start the thread
            thread.start();

            // Main thread continues its work while the MyThread runs concurrently
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main thread is running: " + i);
                Thread.sleep(500);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

