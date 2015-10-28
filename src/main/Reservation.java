package main;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Reservation {
	
	
	private List<Hotel> hotels;

	public Reservation(List<Hotel> hotels) {
		this.hotels = hotels;
	}

	public Hotel findCheapestHotelFor(CustomerStrategy customerType, Date date) {
		boolean isWeekDay = isWeekDay(date);
		Hotel cheapestHotel = null;
		for(Hotel hotel: hotels){
			cheapestHotel = customerType.getCheaperHotel(cheapestHotel, hotel, isWeekDay);
		}
		return cheapestHotel;
	}

	private boolean isWeekDay(Date date) {
		boolean isDayOfWeeek;
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.MONDAY:
			isDayOfWeeek = true;
			break;
		case Calendar.TUESDAY:
			isDayOfWeeek = true;
			break;
		case Calendar.WEDNESDAY:
			isDayOfWeeek = true;
			break;
		case Calendar.THURSDAY:
			isDayOfWeeek = true;
			break;
		case Calendar.FRIDAY:
			isDayOfWeeek = true;
			break;
		default:
			isDayOfWeeek = false;
			break;
		}
		return isDayOfWeeek;
	}

}
