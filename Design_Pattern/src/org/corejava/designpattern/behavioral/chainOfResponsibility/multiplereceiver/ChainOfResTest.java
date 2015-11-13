package org.corejava.designpattern.behavioral.chainOfResponsibility.multiplereceiver;

public class ChainOfResTest {

	public static void main(String[] args) {
		ATM atm = new ATM();
		
		int amount = 2600;
		System.out.println("Withdrawing amount:" + amount);
		atm.withdraw(amount);
		
		amount = 3900;
		System.out.println("Withdrawing amount:" + amount);
		atm.withdraw(amount);
		
		amount = 3920;
		System.out.println("Withdrawing amount:" + amount);
		atm.withdraw(amount);

	}

}
