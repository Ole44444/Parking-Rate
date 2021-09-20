package moonpark.parkingrate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/takst/M1")
    public ParkingZone calculateM1(@RequestParam String start, @RequestParam String end) {
        ParkingZone obj = new M1();
        obj.calculateRate(start, end);
        return obj;
    }

    @GetMapping("/takst/M2")
    public ParkingZone calculateM2(@RequestParam String start, @RequestParam String end) {
        ParkingZone obj = new M2();
        obj.calculateRate(start, end);
        return obj;
    }

    @GetMapping("/takst/M3")
    public ParkingZone calculateM3(@RequestParam String start, @RequestParam String end) {
        ParkingZone obj = new M3();
        obj.calculateRate(start, end);
        return obj;
    }
}
