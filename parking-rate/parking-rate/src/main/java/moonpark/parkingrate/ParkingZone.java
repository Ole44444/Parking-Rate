package moonpark.parkingrate;

public abstract class ParkingZone {
    public double price;
    public abstract double calculateRate(String start, String end);
}
