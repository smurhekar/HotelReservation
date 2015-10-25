package main;

import java.util.Calendar;
import java.util.Date;

public class Reservation {

	public Hotel findCheapestHotelFor(String customerType, Date date) {
		boolean isDayOfWeeek = isDayOfWeek(date);
		Hotel cheapestHotel = null;
		for(Hotel hotel: Hotel.hotels){
			if(customerType.equals("Regular")){
				double hotelRate = isDayOfWeeek ? hotel.getWeekdayRateForRegular() : hotel.getWeekendRateForRegular();
				if(null != cheapestHotel){
					double cheapestHotelRate = isDayOfWeeek ? cheapestHotel.getWeekdayRateForRegular() : cheapestHotel.getWeekendRateForRegular();
					if(hotelRate < cheapestHotelRate){
						cheapestHotel = hotel;
					}
				}else{
					cheapestHotel = new Hotel(hotel.getName(), hotel.getRating(), hotel.getWeekdayRateForRegular(), hotel.getWeekdayRateForRewards(), 
							hotel.getWeekendRateForRegular(), hotel.getWeekendRateForRewards());
				} 
			}
		}
		return cheapestHotel;
	}

	private boolean isDayOfWeek(Date date) {
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
