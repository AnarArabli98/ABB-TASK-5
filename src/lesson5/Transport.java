package lesson5;

public interface Transport {

    double calculateFare(double distance);
    double calculateTime(double distance);
    String getTransportInfo();
    double calculateFare(double distance, int passangers);


}
