package moonpark.parkingrate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ParkingRateApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void parkingZoneM1(){
		String start = "2021-09-09 15:34:54";
		String end = "2021-09-10 15:34:55";
		ParkingZone obj = new M1();
		double price = 1441;
		assertEquals(price, obj.calculateRate(start,end));
	}

	@Test
	void M2(){
		String start = "2021-09-09 15:34:54";
		String end = "2021-09-11 15:35:55";
		ParkingZone obj = new M2();
		double price = 6500;
		assertEquals(price, obj.calculateRate(start,end));
	}

	@Test
	void M3(){
		String start = "2021-09-09 15:34:54";
		String end = "2021-09-12 15:35:55";
		ParkingZone obj = new M3();
		double price = 2*8*3*60 + 8*2*60 + 3*8*60 + 2*8*60*3+2*8*60;
		assertEquals(price, obj.calculateRate(start,end));
	}



}
