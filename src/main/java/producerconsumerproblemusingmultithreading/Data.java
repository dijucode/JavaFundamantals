package producerconsumerproblemusingmultithreading;

import java.util.LinkedList;
import java.util.Queue;

public class Data {

    Queue<String> q;
    int capacity;

    // Constructor to initialize the queue and set the capacity
    public Data(int capacity) {
        this.q = new LinkedList<>();
        this.capacity = capacity;
    }

    // Synchronized method for producers to add data to the queue
    public synchronized void produce(String msg) throws InterruptedException {
        while (q.size() == capacity) {
            System.out.println(Thread.currentThread().getName() + " waiting, queue is full...");
            wait();  // Wait if queue is full
        }

        q.add(msg);
        System.out.println(Thread.currentThread().getName() + " produced: " + msg);
        System.out.println("Queue: " + q);
        notifyAll();  // Notify consumer(s)
    }

    // Synchronized method for consumers to consume data from the queue
    public synchronized void consume() throws InterruptedException {
        while (q.isEmpty()) {
            System.out.println(Thread.currentThread().getName() + " waiting, queue is empty...");
            wait();  // Wait if queue is empty
        }

        String msg = q.poll();
        System.out.println(Thread.currentThread().getName() + " consumed: " + msg);
        System.out.println("Queue: " + q);
        notifyAll();  // Notify producer(s)
    }
}
