package org.corejava.designpattern.creational.abstractfactory;

public class TechnicalLead implements Employee{

	@Override
	public int getSalary() {
		System.out.println(">>>>>>>>>Calculating Tech Lead Salary.");
		return 100000;
	}

}
