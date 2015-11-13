package org.corejava.designpattern.behavioral.observer;

public class Person implements Observer{
	
	public String personName;
	
	public Person(String personName) {
		this.personName = personName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public void update(Subject sub) {
		System.out.println("Dear " + this.personName + ", " + sub + ": is available now. You may login to our website and place an order.");
		
	}

}
