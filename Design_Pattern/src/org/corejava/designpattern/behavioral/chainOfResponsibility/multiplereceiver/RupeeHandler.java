package org.corejava.designpattern.behavioral.chainOfResponsibility.multiplereceiver;

public abstract class RupeeHandler {
	private RupeeHandler nextRuppeeHandler;

	public RupeeHandler getNextRuppeeHandler() {
		return nextRuppeeHandler;
	}

	public void setNextRuppeeHandler(RupeeHandler rupeeHandler) {
		this.nextRuppeeHandler = rupeeHandler;
	}
	
	public abstract void withdrawAmount(int amount);
}
