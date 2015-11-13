package org.corejava.designpattern.behavioral.strategy;

public class BusTravelStrategy implements TravelStrategy {

	@Override
	public void gotoAirport() {
		System.out.println("The traveller is going to airport by Bus. Total cost will be Rs.200 only.");
	}

}
