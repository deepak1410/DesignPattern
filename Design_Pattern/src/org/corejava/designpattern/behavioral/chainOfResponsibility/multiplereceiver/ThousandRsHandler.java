package org.corejava.designpattern.behavioral.chainOfResponsibility.multiplereceiver;

public class ThousandRsHandler extends RupeeHandler {


	@Override
	public void withdrawAmount(int amount) {
		if(amount < 1000) {
			this.getNextRuppeeHandler().withdrawAmount(amount);
		} else {
			int thousandDenominators = amount/1000;
			System.out.println("No. of 1000 denominators=" + thousandDenominators);
			int remainingAmt = amount % 1000;
			if(remainingAmt > 0) {
				this.getNextRuppeeHandler().withdrawAmount(remainingAmt);
			}
		}
		
	}

}
