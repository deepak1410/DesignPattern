package org.corejava.designpattern.behavioral.strategy;

public class TravelContext {

	private TravelStrategy travelStrategy;

	public TravelStrategy getTravelStrategy() {
		return travelStrategy;
	}

	public void setTravelStrategy(TravelStrategy travelStrategy) {
		this.travelStrategy = travelStrategy;
	}
	
	public void gotoAirport() {
		travelStrategy.gotoAirport();
	}
	
	
}
