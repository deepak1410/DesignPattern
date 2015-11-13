package org.corejava.designpattern.behavioral.strategy;

public class TaxiTravelStrategy implements TravelStrategy {

	@Override
	public void gotoAirport() {
		System.out.println("The traveller is going to airport by Taxi.Total cost will be Rs.1500 only.");
	}

}
