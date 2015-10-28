package main;

public class Regular implements CustomerStrategy {

	@Override
	public Hotel getCheaperHotel(Hotel cheapestHotel, Hotel hotel, boolean isWeekDay) {
		if(hotel.isRegularCheaperThan(cheapestHotel, isWeekDay)){
		    return hotel.clone();
		}
		return cheapestHotel;
	}

}
