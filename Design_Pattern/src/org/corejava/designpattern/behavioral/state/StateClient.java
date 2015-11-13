package org.corejava.designpattern.behavioral.state;

public class StateClient {

	public static void main(String[] args) {
		ATMMachineState atmMachineState = new ATMMachineImpl();
		System.out.println("*************Trying to Eject Debit card***************");
		atmMachineState.ejectDebitCard();
		
		System.out.println("\n***************Trying to withdaw amount****************");
		atmMachineState.enterPinAndWithdrawAmt();
		
		System.out.println("\n***************Trying to Insert card****************");
		atmMachineState.insertDebitCard();
		
		System.out.println("\n***************Trying to withdaw amount****************");
		atmMachineState.enterPinAndWithdrawAmt();
		
		System.out.println("\n***************Trying to Insert card again****************");
		atmMachineState.insertDebitCard();
		
		System.out.println("\n*************Trying to Eject Debit card***************");
		atmMachineState.ejectDebitCard();
		
	}

}
