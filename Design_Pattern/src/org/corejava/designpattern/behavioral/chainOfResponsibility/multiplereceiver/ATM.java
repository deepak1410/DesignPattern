package org.corejava.designpattern.behavioral.chainOfResponsibility.multiplereceiver;

public class ATM {

	private static RupeeHandler thousands;
	private static RupeeHandler fiveHundreds;
	private static RupeeHandler hundreds;
	
	static {
		thousands = new ThousandRsHandler();
		fiveHundreds = new FiveHundredRsHandler();
		hundreds = new HundredRsHandler();
		
		thousands.setNextRuppeeHandler(fiveHundreds);
		fiveHundreds.setNextRuppeeHandler(hundreds);
	}
	
	public void withdraw(int amt) {
		if((amt % 100) > 0 || amt==0 || amt<0) {
			System.out.println("Invalid amount. Please enter an amount multiple of 100.");
		} else {
			thousands.withdrawAmount(amt);
		}
	}
	
	
}
