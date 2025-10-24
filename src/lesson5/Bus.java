package lesson5;

public class Bus implements Transport{
    private final double ratePerKM;
    private final double speed;

    public Bus(double ratePerKM, double speed) {
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
    public double calculateFare(double distance, int passangers) {
        return calculateFare(distance) * Math.max(passangers, 1);
    }

    @Override
    public String getTransportInfo() {
        return "Bus / Rate " + ratePerKM + " per km / speed " + speed + " km/h";
    }
}
