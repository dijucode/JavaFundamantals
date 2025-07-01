package producerconsumerproblemusingmultithreading;

public class Consumer implements Runnable {

    private Data data;

    public Consumer(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                data.consume();
                Thread.sleep(6000);  // Simulating delay in consuming
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
