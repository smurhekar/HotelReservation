package main;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	
	private int rating;
	private double weekdayRateForRegular;
	private double weekdayRateForRewards;
	private double weekendRateForRegular;
	private double weekendRateForRewards;
	private String name;
	
	public double getWeekdayRateForRegular() {
		return weekdayRateForRegular;
	}

	public double getWeekdayRateForRewards() {
		return weekdayRateForRewards;
	}

	public double getWeekendRateForRegular() {
		return weekendRateForRegular;
	}

	public double getWeekendRateForRewards() {
		return weekendRateForRewards;
	}
	
	public int getRating(){
		return rating;
	}
	
	public String getName(){
		return name;
	}

	Hotel(String name, int rating, double weekdayRateForRegular, double weekdayRateForRewards, 
			double weekendRateForRegular, double weekendRateForRewards) {
		this.name = name;
		this.rating = rating;
		this.weekdayRateForRegular = weekdayRateForRegular;
		this.weekdayRateForRewards = weekdayRateForRewards;
		this.weekendRateForRegular = weekendRateForRegular;
		this.weekendRateForRewards = weekendRateForRewards;
	}
	public static final Hotel lakewood = new Hotel("Lakewood", 3, 110, 80, 90, 80);
	public static final Hotel bridgewood = new Hotel("Bridgewood", 4, 160, 110, 60, 50);
	public static final Hotel ridgewood = new Hotel("Ridgewood", 5, 220, 100, 150, 40);
	
	public static List<Hotel> hotels = new ArrayList<Hotel>(){
		{
			add(lakewood);
			add(bridgewood);
			add(ridgewood);
		}
	};

}
