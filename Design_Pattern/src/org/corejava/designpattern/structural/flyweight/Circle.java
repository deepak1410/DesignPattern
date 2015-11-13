package org.corejava.designpattern.structural.flyweight;

public class Circle implements Shape {
	
	/*Instinctive properties*/
	private int x;
	private int y;
	private int radius;
	/* Extinctive Properties */
	private String color;
	
	public Circle(String color) {
		this.color=color;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("Circle has been drawn: " + this);

	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "] Hashcode @" + this.hashCode();
	}
	
	

}
