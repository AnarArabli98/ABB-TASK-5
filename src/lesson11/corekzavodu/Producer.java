package lesson11.corekzavodu;

public class Producer implements Runnable {

    private final BreadStore breadStore;

    public Producer(BreadStore breadStore) {
        this.breadStore = breadStore;
    }

    @Override
    public void run() {
        int counter = 1;
        while (true) {
            String bread = "Bread " +  counter++;
            breadStore.produce(bread);

            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
