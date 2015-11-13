package org.corejava.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject{
	
	private String productName;
	private int productPrice;
	private Boolean availability;
	private List<Observer> observers = new ArrayList<Observer>();
	
	public Product(String productName, int productPrice, Boolean availability) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.availability = availability;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public Boolean getAvailability() {
		return availability;
	}
	public void setAvailability(Boolean availability) {
		this.availability = availability;
		if(this.availability) {
			notifyObservers(this);
		}
	}
	public List<Observer> getObservers() {
		return observers;
	}
	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers(Subject p) {
		for(Observer observer : observers) {
			observer.update(p);
		}
		
	}

	@Override
	public String toString() {
		return "Product [" + productName + "(Price=" + productPrice + ")]";
	}
	
	
	

}
