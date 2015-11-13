package org.corejava.designpattern.behavioral.chainOfResponsibility.singlereceiver;

public abstract class Employee {
	Employee supervisor;
	
	
	public Employee getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Employee supervisor) {
		this.supervisor = supervisor;
	}

	public abstract void applyLeave(String employeeName, int numOfDays);
	
}
