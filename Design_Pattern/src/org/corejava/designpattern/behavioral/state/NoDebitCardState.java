package org.corejava.designpattern.behavioral.state;

public class NoDebitCardState implements ATMMachineState {

	@Override
	public void insertDebitCard() {
		System.out.println("Inserting the Debit Card.");

	}

	@Override
	public void ejectDebitCard() {
		System.out.println("There is no Debit card inserted.");

	}

	@Override
	public void enterPinAndWithdrawAmt() {
		System.out.println("Please insert Debit card to Enter Pin and withdraw amount.");

	}

}
