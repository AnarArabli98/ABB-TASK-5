package lesson8.homework;

public class Practize {
    static void main() {
        CarRentalSystem carRentalSystem = new CarRentalSystem();
        Car car = new Car(1,"Toyota" , "Camry" , 2022);
        Car car2 = new Car(2,"Ford" , "Fusion" , 2020);
        Car car3 = new Car(3,"BMW" , "X5" , 2021);
        carRentalSystem.addCar(car);
        carRentalSystem.addCar(car2);
        carRentalSystem.addCar(car3);

        Customer customer = new Customer(101,"Anar" , "AZ12345");
        Customer customer2 = new Customer(102,"Ayla" , "AZ12321");
        Customer customer3 = new Customer(103,"Ali" , "AZ125867");

        carRentalSystem.rentCar(customer,car);
        carRentalSystem.rentCar(customer2,car2);
        carRentalSystem.printActiveRental();
        carRentalSystem.printAvailableRental();
        carRentalSystem.returnCar(customer,car);
        carRentalSystem.returnCar(customer2,car2);
        carRentalSystem.printRentalHistory();

    }
}
