package producerconsumerproblemusingmultithreading;

public class Main {

    public static void main(String[] args) {

        Data data = new Data(5);  // Queue size of 5

        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer(data), "Producer");
        Thread consumerThread = new Thread(new Consumer(data), "Consumer");

        // Start the threads
        producerThread.start();
        consumerThread.start();
    }
}
