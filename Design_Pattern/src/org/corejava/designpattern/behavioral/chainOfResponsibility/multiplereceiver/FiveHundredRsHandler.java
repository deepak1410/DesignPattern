package org.corejava.designpattern.behavioral.chainOfResponsibility.multiplereceiver;

public class FiveHundredRsHandler extends RupeeHandler {


	@Override
	public void withdrawAmount(int amount) {
		if(amount < 500) {
			this.getNextRuppeeHandler().withdrawAmount(amount);
		} else {
			int fiveHundredDenominators = amount/500;
			System.out.println("No. of 500 denominators=" + fiveHundredDenominators);
			int remainingAmt = amount % 500;
			if(remainingAmt > 0) {
				this.getNextRuppeeHandler().withdrawAmount(remainingAmt);
			}
			 
		}
		
	}

}
