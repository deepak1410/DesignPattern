package org.corejava.designpattern.structural.composite;

public interface IEmployee {

	double CEO_VARIABLE_PAY = .3;
	double MANAGER_VARIABLE_PAY = .25;
	double LEAD_VARIABLE_PAY = .25;
	double SE_VARIABLE_PAY = .2;
	
	double VARIABLE_PAY_PERCENTAGE_THIS_YEAR = .8;
	
	public int calculateTotalSalary();
	public void addReporters(IEmployee employee);
	public void removeReporters(IEmployee employee);

}
