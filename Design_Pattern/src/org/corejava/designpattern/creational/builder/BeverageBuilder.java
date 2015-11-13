package org.corejava.designpattern.creational.builder;

public abstract class BeverageBuilder {
	
	Beverage beverage = new Beverage();
	
	public Beverage getBeverage() {
		return beverage;
	}

	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}

	public Beverage buildBeverage(BeverageBuilder builder) {
		builder.mixMilk();
		builder.mixWater();
		builder.mixSugar();
		builder.mixPowder();
		return builder.getBeverage();
		
	}
	
	public abstract void mixWater();
	public abstract void mixMilk();
	public abstract void mixSugar();
	public abstract void mixPowder();

}
