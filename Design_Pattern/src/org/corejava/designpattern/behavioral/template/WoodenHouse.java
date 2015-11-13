package org.corejava.designpattern.behavioral.template;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildFoundation() {
		System.out.println("Constructed foundation for wooden House");
	}

	@Override
	public void buildPillars() {
		System.out.println("Constructed Pillars for wooden House");
	}

	@Override
	public void buildWalls() {
		System.out.println("Constructed Walls for wooden House");
	}

	@Override
	public void buildWindows() {
		System.out.println("Constructed Windows for wooden House");
	}

	@Override
	public String toString() {
		return "WoodenHouse";
	}

}
