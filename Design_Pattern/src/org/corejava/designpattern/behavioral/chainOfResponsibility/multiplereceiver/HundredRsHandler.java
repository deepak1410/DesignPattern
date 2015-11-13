package org.corejava.designpattern.behavioral.chainOfResponsibility.multiplereceiver;

public class HundredRsHandler extends RupeeHandler {


	@Override
	public void withdrawAmount(int amount) {
		if(amount < 100) {
			this.getNextRuppeeHandler().withdrawAmount(amount);
		} else {
			int hundredDenominators = amount/100;
			System.out.println("No. of 100 denominators=" + hundredDenominators);
			int remainingAmt = amount % 100;
			if(remainingAmt > 0) {
				System.out.println("Invalid amount.");
			}
		}
		
	}

}
