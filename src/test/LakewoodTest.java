package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Lakewood;

public class LakewoodTest {
	
	@Test
	public void shouldBeAbleToGetRatingForLakewood(){
		Lakewood lakewood = new Lakewood();
		assertEquals("Ratings: 3", lakewood.toString());
	}
	

}
