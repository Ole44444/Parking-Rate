package moonpark.parkingrate;

import java.time.LocalDateTime;

public class M2 extends ParkingZone {

    @Override
    public double calculateRate(String start, String end) {

        LocalDateTime startTime = ParkingCalculatorUtils.convertToLocalDateTime(start);
        LocalDateTime endTime = ParkingCalculatorUtils.convertToLocalDateTime(end);
        double hours = ParkingCalculatorUtils.getDifferenceHours(startTime, endTime);

        for(int i=0; i<hours; i++) {
            String dag = startTime.plusHours(i).getDayOfWeek().toString();
            if(dag != "SATURDAY" && dag != "SUNDAY") {
                price += 100;
            }
            else price += 200;
        }
        return price;
    }
}
