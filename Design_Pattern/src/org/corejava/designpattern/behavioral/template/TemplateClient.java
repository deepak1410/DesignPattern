package org.corejava.designpattern.behavioral.template;

public class TemplateClient {

	public static void main(String[] args) {
		
		System.out.println("*****Building a Glass House*****");
		HouseTemplate glassHouse = new GlassHouse();
		glassHouse.constructHouse();
		
		System.out.println("\n*****Building a Wooden House*****");
		HouseTemplate woodenHouse = new WoodenHouse();
		woodenHouse.constructHouse();
		
		System.out.println("\n*****Building a Concreate House*****");
		HouseTemplate concereateHouse = new ConcreateHouse();
		concereateHouse.constructHouse();


	}

}
