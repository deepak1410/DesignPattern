package org.corejava.designpattern.creational.builder;

public class BeverageClient {

	public static void main(String[] args) {
		
		Beverage coffee = BeverageMaker.makeBeverage("coffee");
		System.out.println(coffee);

		System.out.println("--------------------------");
		Beverage tea = BeverageMaker.makeBeverage("tea");
		System.out.println(tea);

		System.out.println("--------------------------");
		Beverage horlicks = BeverageMaker.makeBeverage("horlicks");
		System.out.println(horlicks);
		
		System.out.println("--------------------------");
		Beverage beer = BeverageMaker.makeBeverage("beer");
		System.out.println(beer);

	}

}
