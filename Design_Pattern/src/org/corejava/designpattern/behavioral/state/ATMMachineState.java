package org.corejava.designpattern.behavioral.state;

public interface ATMMachineState {
	void insertDebitCard();
	void ejectDebitCard();
	void enterPinAndWithdrawAmt();
}
