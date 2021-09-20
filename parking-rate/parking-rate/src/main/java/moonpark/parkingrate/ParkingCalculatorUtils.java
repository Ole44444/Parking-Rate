package moonpark.parkingrate;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import static java.lang.Math.ceil;

public class ParkingCalculatorUtils {

    public static LocalDateTime convertToLocalDateTime(String tid) {
        StringBuilder buffer = new StringBuilder(tid);
        buffer.replace(10,11, " ");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.parse(buffer.substring(0, 19), formatter);
    }

    public static String convertToString(LocalDateTime tid) {
        String temp = tid.toString();
        StringBuilder buffer = new StringBuilder(temp);
        buffer.replace(10,11, " ");
        return buffer.substring(0, 19).toString();
    }

    public static double getDifferenceMinutes(LocalDateTime start, LocalDateTime slutt) {
        double a = start.toEpochSecond(ZoneOffset.UTC);
        double b = slutt.toEpochSecond(ZoneOffset.UTC);
        return ceil((b-a)/60);
    }
    public static double getDifferenceHours(LocalDateTime start, LocalDateTime slutt) {
        double a = start.toEpochSecond(ZoneOffset.UTC);
        double b = slutt.toEpochSecond(ZoneOffset.UTC);
        return ceil((b-a)/3600);
    }

    public static boolean timeBetween8_16(LocalDateTime time){
        return time.getHour() >= 8 && time.getHour() < 16;
    }
}
