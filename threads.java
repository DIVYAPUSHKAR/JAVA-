class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing");
    }
}
 class threads {
    public static void main(String[] args) {
        
        MyThread myThread = new MyThread();

        
        myThread.start();
    }
}

