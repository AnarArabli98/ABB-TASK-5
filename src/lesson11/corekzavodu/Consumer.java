package lesson11.corekzavodu;

public class Consumer implements Runnable {

    private final BreadStore breadStore;

    public Consumer(BreadStore breadStore) {
        this.breadStore = breadStore;
    }

    @Override
    public void run() {
        while (true) {
            breadStore.consume();
            try {
                Thread.sleep(800);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

    }
}
