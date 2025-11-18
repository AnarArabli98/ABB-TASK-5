package lesson11.classwork;

public class ThreadWithExtend extends Thread {
    @Override
    public void run() {
        System.out.println("Running with ThreadWithExtend");
    }
}
