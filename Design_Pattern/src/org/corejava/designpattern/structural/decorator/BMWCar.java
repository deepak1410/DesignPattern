package org.corejava.designpattern.structural.decorator;

public class BMWCar implements Car{

	private String carName;
	private String carType;
	private int average;
	private int price;
	private String engine;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
	

	@Override
	public String toString() {
		return "BMWCar [carName=" + carName + ", carType=" + carType + ", average=" + average + ", price=" + price + ", engine=" + engine
				+ "]";
	}

	@Override
	public Car manufacture() {
		this.carName = "BMW Sedan";
		this.price = 5000000;
		this.average = 20;
		return this;
	}

}
