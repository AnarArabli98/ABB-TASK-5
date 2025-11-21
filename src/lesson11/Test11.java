package lesson11;

import lesson11.classwork.Counter;
import lesson11.corekzavodu.BreadStore;
import lesson11.corekzavodu.Consumer;
import lesson11.corekzavodu.Producer;
import lesson11.homework.PizzaOrder;

public class Test11 {
     static void main(String[] args) {
//        ThreadWithExtend thread = new ThreadWithExtend();
//        ThreadWithRunnable thread1 = new ThreadWithRunnable();
//        Thread th =  new Thread(thread1);
//
//
//        Runnable runnable = ()->{
//            System.out.println("runnable");
//        };
//
//
//        Thread t = new Thread(runnable,"MY Thread");
//        t.start();
//--------------------------------------------------------------
//        NotificationService notificationService = new NotificationService();
//
//        Thread threadnot = new Thread(() -> {
//            try {
//                notificationService.notifyUser();
//            }catch (Exception e){
//                throw new RuntimeException(e);
//            }
//        });
//        Thread thread1 = new Thread(() -> {
//            try {
//                notificationService.notifyAdmin();
//            }catch (Exception e){
//                throw new RuntimeException(e);
//            }
//        });
//        thread1.start();
//        threadnot.start();
        //--------------------------------------
//        Thread th = new Thread(()->{
//            System.out.println("Hello World");
//        });
//
//        Thread th2 = new Thread(()->{
//            try {
//                th.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Hello World1");
//        });
//        Thread th3 = new Thread(()->{
//            try {
//                th2.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Hello World2");
//        });
//        Thread th4 = new Thread(()->{
//            try {
//                th3.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Hello World3");
//        });
//        th.start();
//        th2.start();
//        th3.start();
//        th4.start();

//        Counter counter = new Counter();
//        Runnable run = ()->{
//            counter.increment();
//        };
//        Thread a = new Thread(run,"A" );
//        Thread b = new Thread(run,"B" );
//        Thread c = new Thread(run,"C" );
//        Thread d = new Thread(run,"D" );
//
//        a.start();
//        b.start();
//        c.start();
//        d.start();

         // task 11  --------------------------------

//         long simulationTime = System.currentTimeMillis();
//
//         PizzaOrder[] order = new PizzaOrder[5];
//         Thread[] threads = new Thread[5];
//
//         for (int i = 0; i < order.length; i++) {
//             order[i] = new PizzaOrder(i+1);
//             threads[i] = new Thread(order[i], "Pizza " + (i+1));
//         }
//
//         for (Thread thread : threads) {
//             thread.start();
//         }
//         for (Thread thread : threads) {
//             try {
//                 thread.join();
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//         long simulationTime2 = System.currentTimeMillis();
//         long totalttt2 = (simulationTime2 - simulationTime)/1000;
//
//         PizzaOrder fastest = order[0];
//         for (PizzaOrder o : order) {
//             if (o.getTotalTime() < fastest.getTotalTime()) {
//                 fastest = o;
//             }
//         }
//
//         System.out.println("=======================================");
//         System.out.println("All orders completed");
//         System.out.println("Total simulation time: " + totalttt2 + " seconds");
//         System.out.println("Fastest order: Order #" + fastest.getOrdernum() +
//                 " → " + fastest.getTotalTime() + " sec");
//         System.out.println("=======================================");


         // ----------------------------------------------------

         BreadStore breadStore = new BreadStore();

         Thread producer = new Thread(new Producer(breadStore),"Producer1");
         Thread producer2 = new Thread(new Producer(breadStore),"Producer2");

         Thread concumer  = new Thread(new Consumer(breadStore),"Consumer1");
         Thread consumer2 = new Thread(new Consumer(breadStore),"Consumer2");
         Thread consumer3 = new Thread(new Consumer(breadStore),"Consumer3");

         producer.start();
         producer2.start();
         concumer.start();
         consumer2.start();
         consumer3.start();

    }
}
