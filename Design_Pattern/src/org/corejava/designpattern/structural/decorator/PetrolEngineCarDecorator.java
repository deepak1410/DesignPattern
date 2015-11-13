package org.corejava.designpattern.structural.decorator;

public class PetrolEngineCarDecorator extends CarDecorator{

	public PetrolEngineCarDecorator(Car car) {
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
			((BMWCar)car).setEngine("Petrol Engine");
		}
		return car;
	}

}
