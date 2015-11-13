package org.corejava.designpattern.creational.builder;

public class Beverage {
	private String beverageName;
	private int water;
	private int sugar;
	private int milk;
	private String powderName;

	public String getBeverageName() {
		return beverageName;
	}
	public void setBeverageName(String beverageName) {
		this.beverageName = beverageName;
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int getSugar() {
		return sugar;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public int getMilk() {
		return milk;
	}
	public void setMilk(int milk) {
		this.milk = milk;
	}
	public String getPowderName() {
		return powderName;
	}
	public void setPowderName(String powderName) {
		this.powderName = powderName;
	}

	@Override
	public String toString() {
		return "Beverage [beverageName=" + beverageName + ", water=" + water + "gm, sugar=" + sugar + "gm, milk=" + milk
				+ "gm, powderName=" + powderName + "]";
	}

}
