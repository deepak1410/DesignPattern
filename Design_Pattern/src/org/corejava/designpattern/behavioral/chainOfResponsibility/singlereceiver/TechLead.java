package org.corejava.designpattern.behavioral.chainOfResponsibility.singlereceiver;

public class TechLead extends Employee {
	
	private static int MAX_LEAVE_APPROVE = 10;

	@Override
	public void applyLeave(String employeeName, int numOfDays) {
		if(numOfDays <= MAX_LEAVE_APPROVE) {
			approveLeave(employeeName, numOfDays);
		} else {
			this.getSupervisor().applyLeave(employeeName, numOfDays);
		}

	}
	
	public void approveLeave(String employeeName, int numOfDays) {
		System.out.println("Dear " + employeeName + ", Tech Lead has approaved " + numOfDays + " days leaves.");
		
	}

}
