package org.corejava.designpattern.structural.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		
		/* Creating a simple Car without decoration */
		Car simpleCar = new BMWCar();
		simpleCar.manufacture();
		
		System.out.println("Car before decoration=" + simpleCar);
		
		Car carWithDieselEngine = new DieselEngineCarDecorator(simpleCar).manufacture();
		System.out.println("car Decorated by Deisel Engine=" + carWithDieselEngine);
		
		Car carWithPetrolEngine = new PetrolEngineCarDecorator(simpleCar).manufacture();
		System.out.println("car Decorated by Deisel Engine=" + carWithPetrolEngine);
	}

}
