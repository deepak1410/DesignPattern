package org.corejava.designpattern.behavioral.state;

public class ATMMachineImpl implements ATMMachineState {

	ATMMachineState atmMachineState;
	
	public ATMMachineImpl() {
		this.atmMachineState = new NoDebitCardState();
	}

	public ATMMachineState getAtmMachineState() {
		return atmMachineState;
	}

	public void setAtmMachineState(ATMMachineState atmMachineState) {
		this.atmMachineState = atmMachineState;
	}

	@Override
	public void insertDebitCard() {
		if(atmMachineState instanceof NoDebitCardState) {
			atmMachineState.insertDebitCard();
			setAtmMachineState(new HasDebitCardState());
			System.out.println("The state of ATM Machine has changed to: " + atmMachineState.getClass().getSimpleName());
		} else {
			System.out.println("A Debit card has been already inserted in the ATM machine.");
		}
		
	}

	@Override
	public void ejectDebitCard() {
		if(atmMachineState instanceof HasDebitCardState) {
			atmMachineState.ejectDebitCard();
			setAtmMachineState(new NoDebitCardState());
			System.out.println("The state of ATM Machine has changed to: " + atmMachineState.getClass().getSimpleName());
		} else {
			System.out.println("No Debit card found in the ATM Machine.");
		}
	}

	@Override
	public void enterPinAndWithdrawAmt() {
		if(atmMachineState instanceof HasDebitCardState) {
			atmMachineState.enterPinAndWithdrawAmt();
		} else {
			System.out.println("Please Insert Debit card before Entering the PIN to withdraw amount.");
		}
	}


}
