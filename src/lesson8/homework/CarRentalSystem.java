package lesson8.homework;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CarRentalSystem {
    private Set<Car> cars = new HashSet<>();
    private Set<Car> availableCars = new HashSet<>();
    private Map<Customer,Car> activeRental = new HashMap<>();
    private Map<Car, LocalDateTime> startRentals = new HashMap<>();
    private Map<Car, LocalDateTime> rentalHistory = new HashMap<>();


    public void addCar(Car car) {
        cars.add(car);
        availableCars.add(car);
    }

    public void rentCar(Customer c, Car car) {
        if(!availableCars.contains(car)) {
            System.out.println("Car " + car + " is not available");
            return;
        }
        LocalDateTime rentTime = LocalDateTime.now();
        activeRental.put(c,car);
        startRentals.put(car,rentTime);
        availableCars.remove(car);

        System.out.println("Car " + car + " is renting");

    }
    public void returnCar(Customer c, Car car) {

        Car returnedCar = activeRental.get(c);
        if(returnedCar == null) {
            System.out.println("No rental found for this car" );
            return;
        }
        LocalDateTime startTime = startRentals.get(car);
        LocalDateTime returnTime = LocalDateTime.now();
        Duration duration = Duration.between(startTime,returnTime);

        long hours = duration.toHours();
        long remainingHours = hours - (hours % 24);

        System.out.println("Car " + car + " is returned at " + remainingHours + " hours");

        rentalHistory.put(car,returnTime);
        availableCars.add(car);

    }

    public void printActiveRental() {
        System.out.println("Active Rental: ");
        if(activeRental.isEmpty()) {
            System.out.println("No cars available");
            return;
        }
        for (Map.Entry<Customer,Car> entry : activeRental.entrySet()) {
            Customer customer = entry.getKey();
            Car car = entry.getValue();
            LocalDateTime startTime = startRentals.get(car);
            System.out.println("Car " + car.getBrand() + " is renting" + customer.getName() + " at " + startTime);

        }
    }

    public void printAvailableRental() {
        System.out.println("Available Rental: ");
        if (availableCars.isEmpty()) {
            System.out.println("No cars available");
            return;
        }
        for (Car car : availableCars) {
            System.out.println(car);
        }
    }


    public void printRentalHistory() {
        System.out.println("Rental History: ");
        if(rentalHistory.isEmpty())
            System.out.println("No past rental history");

        for (var entry : rentalHistory.entrySet()) {
            Car car = entry.getKey();
            LocalDateTime endTime = entry.getValue();
            LocalDateTime startTime = startRentals.get(car);

            System.out.println("Car " + car.getBrand() + " is renting at " + startTime + "till " + endTime);
        }






    }
}
