package lesson5;

public class Taxi implements Transport{
    private final double ratePerKM;
    private final double speed;

    public Taxi(double ratePerKM, double speed) {
        this.ratePerKM = ratePerKM;
        this.speed =speed;
    }

    @Override
    public double calculateFare(double distance) {

        return distance * ratePerKM;
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public double calculateFare(double distance, int passangers) {
        return (distance * ratePerKM) * passangers;
    }
    @Override
    public String getTransportInfo() {
        return "TAXI (Rate: " + ratePerKM + ", Speed: " + speed + ")";
    }
}
