package org.corejava.designpattern.behavioral.memento;

public class Originator {
	private LedTV ledTV;

	public LedTV getLedTV() {
		return ledTV;
	}

	public void setLedTV(LedTV ledTV) {
		this.ledTV = ledTV;
	}
	
	public Memento createMemento() {
		return new Memento(ledTV);
	}
	
	public void saveMemento(Memento memento) {
		memento.setLedTv(ledTV);
	}

}
