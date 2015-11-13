package org.corejava.designpattern.behavioral.observer;

public class ObserverTest {

	public static void main(String[] args) {

		/* Create a Product*/
		Product tv  = new Product("LED TV", 30500, false);
		Product mobile  = new Product("Iphone 7S", 50500, false);
		
		/* Create Persons */
		Observer david = new Person("David");
		Observer john = new Person("John");
		Observer tom = new Person("Tom");
		
		tv.registerObserver(david);
		tv.registerObserver(john);
		
		mobile.registerObserver(john);
		tv.removeObserver(john);
		tv.setAvailability(true);
		mobile.setAvailability(true);
		

	}

}
