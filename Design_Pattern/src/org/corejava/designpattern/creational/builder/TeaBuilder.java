package org.corejava.designpattern.creational.builder;

public class TeaBuilder extends BeverageBuilder {

	public TeaBuilder() {
		System.out.println("Preparing Tea.");
	}
	
	@Override
	public void mixWater() {
		System.out.println("Mixing 200gm of water for the Tea.");
		beverage.setWater(200);
	}

	@Override
	public void mixMilk() {
		System.out.println("Mixing 400gm of milk for the Tea.");
		beverage.setMilk(400);
	}

	@Override
	public void mixSugar() {
		System.out.println("Mixing 150gm of Sugar for the Tea.");
		beverage.setSugar(200);
	}

	@Override
	public void mixPowder() {
		System.out.println("Adding 100gm Tea powder");
		beverage.setBeverageName("Tea");
		beverage.setPowderName("TATA Tea Powder");
		
	}

}
