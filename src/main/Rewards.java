package main;

public class Rewards implements CustomerStrategy{

	@Override
	public Hotel getCheaperHotel(Hotel cheapestHotel, Hotel hotel,
			boolean isWeekDay) {
		if(hotel.isRewardsCheaperThan(cheapestHotel, isWeekDay)){
            cheapestHotel = hotel.clone();
        }
		return cheapestHotel;
	}

}
