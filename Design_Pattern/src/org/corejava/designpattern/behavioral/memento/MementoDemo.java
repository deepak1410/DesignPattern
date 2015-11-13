package org.corejava.designpattern.behavioral.memento;

public class MementoDemo {

	public static void main(String[] args) {
		
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		/* Creating 1st LedTV */
		LedTV tv1 = new LedTV("42 inch", 50000, false);
		
		/* Creating 2nd LedTV */
		LedTV tv2 = new LedTV("46 inch", 60000, true);
		
		/* Creating 1st LedTV */
		LedTV tv3 = new LedTV("50 inch", 70000, true);
		
		originator.setLedTV(tv2);
		originator.setLedTV(tv1);
		
		careTaker.addMemento(originator.createMemento());
		System.out.println(careTaker.getMemento(0).getLedTv());
		
		originator.setLedTV(tv1);
		originator.setLedTV(tv3);
		
		careTaker.addMemento(originator.createMemento());
		System.out.println(careTaker.getMemento(1).getLedTv());

	}

}
