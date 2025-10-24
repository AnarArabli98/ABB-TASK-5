package lesson5;

import static lesson5.TransportType.TAXI;


public class TransportManager {

    static void main(String[] args) {

        TransportType choice = TAXI;
        double distance = 10.0;
        int passengers = 2;

        Transport transport = getTransport(choice);

        System.out.println("Transport Info " + transport.getTransportInfo());
        System.out.println("Fare for " + passengers + " passengers : "
                + transport.calculateFare(distance,passengers));
        System.out.println();
        System.out.println("Estimated time :" + transport.calculateTime(distance) + " hours");



    }

    public static Transport getTransport(TransportType type) {
        switch (type){
            case TAXI -> {
                return new Taxi(1.2,70);
            }
            case BUS -> {
                return new Bus(0.5,60);
            }
            case SCOOTER -> {
                return new Scooter(0.2,40);
            }
            case BICYCLE ->{
                return new Bicycle(0.1,30);
            }

            default -> throw new IllegalArgumentException("Unknown transport type");
        }
    }


}
