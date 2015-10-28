package main;

public interface CustomerStrategy {

	public Hotel getCheaperHotel(Hotel cheapestHotel, Hotel hotel, boolean isWeekDay);
}
