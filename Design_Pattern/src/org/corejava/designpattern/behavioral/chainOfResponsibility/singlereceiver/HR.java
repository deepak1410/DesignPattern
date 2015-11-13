package org.corejava.designpattern.behavioral.chainOfResponsibility.singlereceiver;

public class HR extends Employee {
	
	private static int MAX_LEAVE_APPROVE = 30;

	@Override
	public void applyLeave(String employeeName, int numOfDays) {
		if(numOfDays <= MAX_LEAVE_APPROVE) {
			approveLeave(employeeName, numOfDays);
		} else {
			System.out.println("Your leaves of" + numOfDays + "can not be approved at this point. Please contact HR.");
		}

	}
	
	public void approveLeave(String employeeName, int numOfDays) {
		System.out.println("Dear " + employeeName + ", HR has approaved your " + numOfDays + " days leaves.");
		
	}

}
