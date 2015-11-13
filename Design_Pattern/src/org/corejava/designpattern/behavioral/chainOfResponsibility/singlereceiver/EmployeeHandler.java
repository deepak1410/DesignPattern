package org.corejava.designpattern.behavioral.chainOfResponsibility.singlereceiver;

public class EmployeeHandler {
	
	static Employee techLead;
	static Employee projectManager;
	static Employee hr;
	
	static {
		techLead = new TechLead();
		projectManager = new ProjectManager();
		hr = new HR();
		
		techLead.setSupervisor(projectManager);
		projectManager.setSupervisor(hr);
		System.out.println("Employee supervisor initiated.");
	}
	
	public void applyLeave(String employeeName, int numOfDays) {
		techLead.applyLeave(employeeName, numOfDays);
	}

}
