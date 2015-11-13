package org.corejava.designpattern.behavioral.template;

public class ConcreateHouse extends HouseTemplate {

	@Override
	public void buildFoundation() {
		System.out.println("Constructed foundation for Concrete House");
	}

	@Override
	public void buildPillars() {
		System.out.println("Constructed Pillars for Concrete House");
	}

	@Override
	public void buildWalls() {
		System.out.println("Constructed Walls for Concrete House");
	}

	@Override
	public void buildWindows() {
		System.out.println("Constructed Windows for Concrete House");
	}
	
	@Override
	public String toString() {
		return "ConcreateHouse";
	}

}
