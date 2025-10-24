package lesson5;

public class Scooter implements Transport{
    private final double ratePerKM;
    private final double speed;

    public Scooter(double ratePerKM, double speed) {
        this.ratePerKM = ratePerKM;
        this.speed = speed;
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
    public String getTransportInfo() {
        return "Scooter | Rate per km: " + ratePerKM + " | Speed: " + speed + " km/h";
    }

    @Override
    public double calculateFare(double distance, int passangers) {
        return calculateFare(distance);
    }
}
