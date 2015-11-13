package org.corejava.designpattern.structural.decorator;

public abstract class CarDecorator implements Car{
	
	protected Car car;
	
	public CarDecorator(Car car) {
		this.car = car;
	}
	
	@Override
	public Car manufacture() {
		car.manufacture();
		return car;
	}
	
	public abstract Car addEngine(Car car);

}
