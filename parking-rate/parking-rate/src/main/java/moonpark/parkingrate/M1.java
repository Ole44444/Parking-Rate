package moonpark.parkingrate;


import java.time.LocalDateTime;

public class M1 extends ParkingZone {

    @Override
    public double calculateRate(String start, String end) {
        LocalDateTime startTime = ParkingCalculatorUtils.convertToLocalDateTime(start);
        LocalDateTime endTime = ParkingCalculatorUtils.convertToLocalDateTime(end);
        double minutes = ParkingCalculatorUtils.getDifferenceMinutes(startTime, endTime);
        price = 1*minutes;
        return price;
    }
}
