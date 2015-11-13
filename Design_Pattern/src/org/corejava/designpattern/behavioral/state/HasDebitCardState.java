package org.corejava.designpattern.behavioral.state;

public class HasDebitCardState implements ATMMachineState {

	@Override
	public void insertDebitCard() {
		System.out.println("Debit card has been already inserted.");

	}

	@Override
	public void ejectDebitCard() {
		System.out.println("Ejecting the Debit Card.");

	}

	@Override
	public void enterPinAndWithdrawAmt() {
		System.out.println("Entering the Pin and withdrawing amount.");

	}

}
