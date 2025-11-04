package lesson7.homework;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Main7 {
    static void main() {
        // Lesson Task 7
        Queue<Passenger> stop1Passengers = new LinkedList<>(Arrays.asList(
                new Passenger("Aysel", true),
                new Passenger("Rauf", false),
                new Passenger("Ali", false)
        ));

        Queue<Passenger> stop2Passengers = new LinkedList<>(Arrays.asList(
                new Passenger("Nigar", true),
                new Passenger("Samir", true),
                new Passenger("Murad", false)
        ));

        Queue<Passenger> stop3Passengers = new LinkedList<>(Arrays.asList(
                new Passenger("Sevinc", true),
                new Passenger("Leyla", false),
                new Passenger("Tural", false)
        ));

        // 3 dayanacaq
        List<BusStop> stops = Arrays.asList(
                new BusStop("Stop 1", stop1Passengers),
                new BusStop("Stop 2", stop2Passengers),
                new BusStop("Stop 3", stop3Passengers)
        );

        Bus bus = new Bus();
        Random random = new Random();

        // Simulyasiya
        for (BusStop stop : stops) {
            System.out.println("\n🚌 " + stop.getName() + " reached.");

            // 1. Avtobusdan təsadüfi sərnişinlər düşür
            bus.dropRandom();

            // 2. Priority sərnişinlər birinci minir
            Queue<Passenger> priorityQueue = new LinkedList<>();
            Queue<Passenger> normalQueue = new LinkedList<>();

            for (Passenger p : stop.getWaitingPassengers()) {
                if (p.isPriority()) priorityQueue.add(p);
                else normalQueue.add(p);
            }

            stop.getWaitingPassengers().clear();

            // Priority olanlar minir
            while (!priorityQueue.isEmpty()) {
                Passenger p = priorityQueue.poll();
                bus.boardPassangers(p);
            }

            // Normal sərnişinlər minir
            while (!normalQueue.isEmpty()) {
                Passenger p = normalQueue.poll();
                bus.boardPassangers(p);
            }

            // 3. Qalan sərnişinlər dayanacaqda qalır
            System.out.println(stop.getName() + " remaining: " + stop.getWaitingPassengers());
            bus.printBusState();
        }

        System.out.println("\n✅ Simulation finished.");
        System.out.println("Final passengers in bus: " + bus.getPassengers());
    }
}
