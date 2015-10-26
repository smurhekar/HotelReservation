package main;


public class Hotel {
	
	private int rating;
	private double weekdayRateForRegular;
	private double weekdayRateForRewards;
	private double weekendRateForRegular;
	private double weekendRateForRewards;
	private String name;
	
	public double getHotelRegularRate(boolean isDayOfWeeek) {
		return isDayOfWeeek ? weekdayRateForRegular : weekendRateForRegular;
	}

	public Hotel(String name, int rating, double weekdayRateForRegular, double weekdayRateForRewards, 
			double weekendRateForRegular, double weekendRateForRewards) {
		this.name = name;
		this.rating = rating;
		this.weekdayRateForRegular = weekdayRateForRegular;
		this.weekdayRateForRewards = weekdayRateForRewards;
		this.weekendRateForRegular = weekendRateForRegular;
		this.weekendRateForRewards = weekendRateForRewards;
	}
	

	public Hotel clone(){
		return new Hotel(name, rating, weekdayRateForRegular, weekdayRateForRewards, weekendRateForRegular, weekendRateForRewards);
	}
	
	@Override
	public boolean equals(Object object){
		if(object == this)
			return true;
		if(!(object instanceof Hotel))
			return false;
		Hotel hotel = (Hotel) object;
		return (hotel.rating == this.rating 
				&& hotel.weekdayRateForRegular == this.weekdayRateForRegular 
				&& hotel.weekendRateForRegular == this.weekendRateForRegular
				&& hotel.weekdayRateForRewards == this.weekdayRateForRewards
				&& hotel.weekendRateForRewards == this.weekendRateForRewards
				&& hotel.name.equals(this.name));
	}
}
