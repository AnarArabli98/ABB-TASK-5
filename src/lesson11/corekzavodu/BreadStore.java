package lesson11.corekzavodu;


import java.util.LinkedList;
import java.util.Queue;

public class BreadStore {

    private final Queue<String> queue =  new LinkedList<>();
    private final int MAX_SIZE = 10;


    public synchronized void produce(String bread) {
        while (queue.size() == MAX_SIZE) {
            try {
                System.out.println(" Producer waiting .... queue doldururlur ");
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        queue.add(bread);
        System.out.println("Producer corek elave etdi : " + bread);
        notifyAll();
    }

    public synchronized String consume() {
        while (queue.isEmpty()) {
            try {
                System.out.println("Consumer waiting .... queue bosdur ");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        String br =  queue.poll();
        System.out.println("Consumer coreyi goturdu : " + br);
        notifyAll();
        return br;
    }

}
