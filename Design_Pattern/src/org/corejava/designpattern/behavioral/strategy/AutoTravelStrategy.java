package org.corejava.designpattern.behavioral.strategy;

public class AutoTravelStrategy implements TravelStrategy {

	@Override
	public void gotoAirport() {
		System.out.println("The traveller is going to airport by Auto. Total cost will be Rs.1000 only.");
	}

}
