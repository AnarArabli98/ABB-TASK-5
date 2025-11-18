package lesson11.classwork;

public class Counter {
    private int counter;

    private Object lock = new Object();

    public void increment() {
        synchronized (this) {
            counter++;
            System.out.println("Incrementing Counter " + counter);
        }
    }

}
