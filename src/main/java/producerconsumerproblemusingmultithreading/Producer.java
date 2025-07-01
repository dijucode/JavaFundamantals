package producerconsumerproblemusingmultithreading;

public class Producer implements Runnable {

    private Data data;

    public Producer(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        String[] messages = {"Msg1", "Msg2", "Msg3", "Msg4", "Msg5", "Msg6"};

        for (String msg : messages) {
            try {
                data.produce(msg);
                Thread.sleep(3000);  // Simulating delay in producing
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
