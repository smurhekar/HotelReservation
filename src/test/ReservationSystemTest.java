package test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import main.Hotel;
import main.Reservation;

public class ReservationSystemTest {
	
	@Test
	public void shouldBeAbleToFindCheapestHotelForRegularCustomer(){
		Reservation reservation = new Reservation();
		assertEquals(Hotel.bridgewood, reservation.findCheapestHotelFor("Regular", new Date()));
	}

}
