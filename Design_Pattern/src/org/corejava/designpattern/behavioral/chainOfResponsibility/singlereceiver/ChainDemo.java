package org.corejava.designpattern.behavioral.chainOfResponsibility.singlereceiver;

public class ChainDemo {

	public static void main(String[] args) {
		
		
		//techLead.applyLeave("John", 5);
		EmployeeHandler emp1 = new EmployeeHandler();
		emp1.applyLeave("John", 5);
		emp1.applyLeave("John", 15);
		emp1.applyLeave("John", 25);
		emp1.applyLeave("John", 35);

	}

}
