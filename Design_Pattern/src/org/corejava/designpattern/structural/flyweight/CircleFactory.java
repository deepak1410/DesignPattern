package org.corejava.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CircleFactory {
	private Map<String, Shape> circleMap = new HashMap<String, Shape>();
	
	public Shape getCircle(String color) {
		Shape circle = circleMap.get(color);
		if(circle == null) {
			circle = new Circle(color);
			if(circle instanceof Circle) {
				((Circle) circle).setRadius(100);
				((Circle) circle).setX(10);
				((Circle) circle).setY(20);
			}
			/* Store the circle object in the map after creation */
			circleMap.put(color, circle);
		}
		return circle;
	}

}
