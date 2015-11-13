package org.corejava.designpattern.behavioral.memento;

public class Memento {
	private LedTV ledTV;
	
	public Memento(LedTV ledTV) {
		this.ledTV = ledTV;
	}

	public LedTV getLedTv() {
		return ledTV;
	}

	public void setLedTv(LedTV ledTV) {
		this.ledTV = ledTV;
	}
	
}
