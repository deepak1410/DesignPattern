package org.corejava.designpattern.creational.builder;

public class CoffeeBuilder extends BeverageBuilder {

	public CoffeeBuilder() {
		System.out.println("Preparing Coffee.");
	}
	
	@Override
	public void mixWater() {
		System.out.println("Mixing 100gm of water for the coffee.");
		beverage.setWater(100);
	}

	@Override
	public void mixMilk() {
		System.out.println("Mixing 250gm of milk for the Coffee.");
		beverage.setMilk(250);
	}

	@Override
	public void mixSugar() {
		System.out.println("Mixing 200gm of Sugar for the Coffee.");
		beverage.setSugar(200);
	}

	@Override
	public void mixPowder() {
		System.out.println("Adding 100gm Coffee powder");
		beverage.setBeverageName("Coffee");
		beverage.setPowderName("Red Label Coffee Powder");
	}

}
