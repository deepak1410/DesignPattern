package org.corejava.designpattern.structural.decorator;

public class DieselEngineCarDecorator extends CarDecorator {

	public DieselEngineCarDecorator(Car car) {
		super(car);
	}

	@Override
	public Car manufacture() {
		addEngine(car);
		return car;
	}

	@Override
	public Car addEngine(Car car) {
		if(car instanceof BMWCar) {
			((BMWCar)car).setEngine("Disel Engine");
		}
		return car;
	}

}
