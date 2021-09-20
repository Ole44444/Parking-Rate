package moonpark.parkingrate;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class M3 extends ParkingZone {

    @Override
    public double calculateRate(String start, String end) {
        LocalDateTime startTime = ParkingCalculatorUtils.convertToLocalDateTime(start);
        LocalDateTime endTime = ParkingCalculatorUtils.convertToLocalDateTime(end);

        String day = startTime.getDayOfWeek().toString();
        while(day=="SUNDAY") {
            startTime = startTime.plusMinutes(1);
            day = startTime.getDayOfWeek().toString();
        }

        if(startTime.getHour() == 15) {
            int diff = startTime.getMinute();
            startTime = startTime.plusMinutes(60-diff);
        }
        else if(ParkingCalculatorUtils.timeBetween8_16(startTime)) {
            startTime = startTime.plusHours(1);
        }

        if(startTime.toEpochSecond(ZoneOffset.UTC) > endTime.toEpochSecond(ZoneOffset.UTC)) {
            price = 0;
            return price;
        }

        double minutes = ParkingCalculatorUtils.getDifferenceMinutes(startTime, endTime);

        for(int i=0; i<minutes; i++) {
            day = startTime.plusMinutes(i).getDayOfWeek().toString();
            if(day != "SUNDAY") {
                price += ParkingCalculatorUtils.timeBetween8_16(startTime.plusMinutes(i)) ? 2 : 3;
            }
        }
        return price;
    }
}