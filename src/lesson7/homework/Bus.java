package lesson7.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bus {

    private final int capacity = 5;
    private List<Passenger> passengers =  new ArrayList<>();
    private Random random = new Random();

    public void dropRandom(){
        if(passengers.isEmpty())
            return;

        int toDrop = random.nextInt(3); // 0,1,2 nəfər düşə bilər
        for (int i = 0; i < toDrop && !passengers.isEmpty(); i++) {
            Passenger removed = passengers.remove(random.nextInt(passengers.size()));
            System.out.println(removed.getName() + " left the bus.");
        }

    }
    public void boardPassangers(Passenger p){
        if (passengers.size() < capacity) {
            passengers.add(p);
            System.out.println(p + " boarded the bus.");
        } else {
            System.out.println("Bus full! " + p + " could not board.");
        }
    }
    public void printBusState() {
        System.out.println("Bus now :" + passengers);
    }
    public List<Passenger> getPassengers() {
        return passengers;
    }

}





