package org.corejava.designpattern.behavioral.template;

public class GlassHouse extends HouseTemplate{

	@Override
	public void buildFoundation() {
		System.out.println("Constructed foundation for Glass House");
	}

	@Override
	public void buildPillars() {
		System.out.println("Constructed Pillars for Glass House");
	}

	@Override
	public void buildWalls() {
		System.out.println("Constructed Walls for Glass House");
	}

	@Override
	public void buildWindows() {
		System.out.println("Constructed Windows for Glass House");
	}
	
	@Override
	public String toString() {
		return "GlassHouse";
	}

}
