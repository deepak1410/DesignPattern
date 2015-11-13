package org.corejava.designpattern.creational.builder;

public class BeverageMaker {
	private static final String COFFEE = "coffee";
	private static final String TEA = "tea";
	private static final String HORLICKS = "horlicks";
	
	public static Beverage makeBeverage(String beverageName) {
		BeverageBuilder builder = getBeverageBuilder(beverageName);
		if(builder != null) {
			return builder.buildBeverage(builder);
		} else {
			System.out.println("Sorry, We don't serve " + beverageName);
			return null;
		}
		
	}
	
	public static BeverageBuilder getBeverageBuilder(String beverageName) {
		BeverageBuilder builder = null;
		if(COFFEE.equalsIgnoreCase(beverageName)) {
			builder = new CoffeeBuilder();
		} else if(TEA.equalsIgnoreCase(beverageName)) {
			builder = new TeaBuilder();
		} else if(HORLICKS.equalsIgnoreCase(beverageName)) {
			builder = new HorlicksBuilder();
		}
		
		return builder;
	}
	

}
