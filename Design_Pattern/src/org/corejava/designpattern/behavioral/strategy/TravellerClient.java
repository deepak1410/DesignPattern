package org.corejava.designpattern.behavioral.strategy;

import java.util.Scanner;

public class TravellerClient {

	public static void main(String[] args) {
		System.out.println("Do you want to go to Airport? Please select any service from the available services: Bus, Taxi or Auto.");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.next();
		
		TravelContext context = new TravelContext();
		
		if(option.equalsIgnoreCase("Bus")) {
			context.setTravelStrategy(new BusTravelStrategy());
		} else if(option.equalsIgnoreCase("Taxi")) {
			context.setTravelStrategy(new TaxiTravelStrategy());
		} else if(option.equalsIgnoreCase("Auto")) {
			context.setTravelStrategy(new AutoTravelStrategy());
		}
		
		if(context.getTravelStrategy() != null) {
			context.gotoAirport();
		} else {
			System.out.println("No service is available for selected service " + option + ". Please choose a valid service.");
		}

	}

}
