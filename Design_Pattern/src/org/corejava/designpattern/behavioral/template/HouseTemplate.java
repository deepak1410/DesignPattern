package org.corejava.designpattern.behavioral.template;

public abstract class HouseTemplate {
	
	public abstract void buildFoundation();
	public abstract void buildPillars();
	public abstract void buildWalls();
	public abstract void buildWindows();
	
	public void constructHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("The " + this + " is ready to occupy now.");
	}
}
