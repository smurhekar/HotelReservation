package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import main.Hotel;
import main.Regular;
import main.Reservation;
import main.Rewards;

import org.junit.Test;

public class ReservationSystemTest {
	@Test
	public void shouldBeAbleToFindCheapestHotelForRegularCustomer(){
		List<Hotel> hotels = new ArrayList<Hotel>(){
			{
				add(new Hotel("Lakewood", 3, 110, 80, 90, 80));
				add(new Hotel("Bridgewood", 4, 160, 110, 60, 50));
				add(new Hotel("Ridgewood", 5, 220, 100, 150, 40));
			}
		};

		Reservation reservation = new Reservation(hotels);
        Calendar calDate = Calendar.getInstance();
        calDate.set(2015,9,25);
		assertEquals(new Hotel("Bridgewood", 4, 160, 110, 60, 50), reservation.findCheapestHotelFor(new Regular(), calDate.getTime()));
	}
	
	@Test
	public void shouldBeAbleToFindCheapestHotelForRewardsCustomer(){
		List<Hotel> hotels = new ArrayList<Hotel>(){
			{
				add(new Hotel("Lakewood", 3, 110, 80, 90, 80));
				add(new Hotel("Bridgewood", 4, 160, 110, 60, 50));
				add(new Hotel("Ridgewood", 5, 220, 100, 150, 40));
			}
		};
		
		Reservation reservation = new Reservation(hotels);
        Calendar calDate = Calendar.getInstance();
        calDate.set(2015,9,25);
		assertEquals(new Hotel("Ridgewood", 5, 220, 100, 150, 40), reservation.findCheapestHotelFor(new Rewards(), calDate.getTime()));

	}

}
