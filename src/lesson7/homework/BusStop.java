package lesson7.homework;

import java.util.Queue;

public class BusStop {

    private String name;
    private Queue<Passenger> waitingPassengers;

    public BusStop(String name, Queue<Passenger> waitingPassengers) {
        this.name = name;
        this.waitingPassengers = waitingPassengers;
    }

    public String getName() {
        return name;
    }

    public Queue<Passenger> getWaitingPassengers() {
        return waitingPassengers;
    }




}
