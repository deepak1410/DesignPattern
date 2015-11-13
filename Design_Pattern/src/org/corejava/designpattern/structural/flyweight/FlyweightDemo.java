package org.corejava.designpattern.structural.flyweight;

public class FlyweightDemo {

	public static void main(String[] args) {
		CircleFactory factory = new CircleFactory();
		Shape circle = null;
		System.out.println("####### Drawing 10 Red color circles #######");
		for(int i=0; i<10; i++) {
			circle = factory.getCircle("red");
			circle.draw();
		}
		
		System.out.println("####### Drawing 10 Green color circles #######");
		for(int i=0; i<10; i++) {
			circle = factory.getCircle("green");
			circle.draw();
		}
		
		System.out.println("####### Again Drawing 10 red color circles #######");
		for(int i=0; i<10; i++) {
			circle = factory.getCircle("red");
			circle.draw();
		}
		
		System.out.println("####### Drawing 10 Blue color circles #######");
		for(int i=0; i<10; i++) {
			circle = factory.getCircle("b");
			circle.draw();
		}

	}

}
