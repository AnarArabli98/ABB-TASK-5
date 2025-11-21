package lesson11.homework;

import java.util.Random;

public class PizzaOrder implements Runnable{
    private final int ordernum;
    private long startTime;
    private long endTime;

    private static final Object lock = new Object();
    private Random rand = new Random();
    public PizzaOrder(int ordernum) {
        this.ordernum = ordernum;
    }

    @Override
    public void run() {
        startTime = System.currentTimeMillis();
        log("Started");
        preparePizza();
        bakePizza();
        deliverPizza();

        endTime = System.currentTimeMillis();
        long totalttt = (endTime - startTime)/1000;
        log("TotalTime: " + totalttt + " seconds");

    }
    public void preparePizza(){
        log("Preparing Pizza");
        sleepRandom(1000,3000);
        log("Completed Preparing Pizza");
    }
    public void bakePizza(){
        log("Baking Pizza");
        sleepRandom(3000,6000);
        log("Completed Baking Pizza");
    }
    public void deliverPizza(){
        log("Delivering Pizza to customer");
        sleepRandom(2000,6000);
        log("Completed Delivered Pizza to customer");
    }
    public void sleepRandom(int min, int max){
        try {
            Thread.sleep(min + rand.nextInt(max-min+1));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void log(String message){
        synchronized (lock){
            System.out.println("[Order#" + ordernum + "] " + message);
        }
    }
    public long getTotalTime(){
        synchronized (lock){
            long totalTime = (endTime - startTime)/1000;
            return totalTime;
        }
    }
    public int getOrdernum(){
        return ordernum;
    }



}
